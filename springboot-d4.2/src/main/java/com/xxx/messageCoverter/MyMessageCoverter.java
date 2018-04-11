package com.xxx.messageCoverter;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import com.xxx.domain.DemoObj;

public class MyMessageCoverter extends AbstractHttpMessageConverter<DemoObj>{

	public MyMessageCoverter() {
		super(new MediaType("application","x-wisely",Charset.forName("UTF-8")));  // 新建一个我们自定义的没提类型
	}

	/**
	 * 表明只处理DemoObj这个类
	 */
	@Override
	protected boolean supports(Class<?> clazz) {
		return DemoObj.class.isAssignableFrom(clazz);
	}

	/**
	 * 处理请求的数据,由"-"隔开,并转成DemoObj对象
	 */
	@Override
	protected DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		String temp = StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("UTF-8"));
		String[] tempArr = temp.split("-");
		return new DemoObj(new Long(tempArr[0]), tempArr[1]);
	}

	/**
	 * 处理如何输出到respone中 我们是原样输出并在前面添加hello
	 */
	@Override
	protected void writeInternal(DemoObj obj, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		String out = "hello :" + obj.getId() + "-" +obj.getName();
		outputMessage.getBody().write(out.getBytes());
	}

}
