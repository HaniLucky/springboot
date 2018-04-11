package com.xxx.web.upload;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 文件上传controller
 */
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class uploadController {
	
	@RequestMapping(value = "upload" ,method = RequestMethod.POST)
	public @ResponseBody String upload(MultipartFile file){  // 使用MultipartFile 接收上传的文件
		try {
			System.out.println(file.getOriginalFilename());
			FileUtils.writeByteArrayToFile(new File("e:/upload/"+file.getOriginalFilename()), file.getBytes()); // 快速读写到磁盘
			return "ok" ; 
		} catch (Exception e) {
			e.printStackTrace();
			return "wrong" ; 
		}
	}

}
