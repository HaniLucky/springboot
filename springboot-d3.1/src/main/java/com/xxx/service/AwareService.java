package com.xxx.service;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * BeanNameAware 获取容器中bean的名称
 * ResourceLoaderAware 获取资源加载器,获取外部资源
 * @author issuser
 *
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
	
	private String beanName;
	private ResourceLoader laoder;

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.laoder = resourceLoader ; 
		
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName ; 
	}
	
	public void outputResult(){
		System.out.println("Bean的名称为:"+beanName);
		
		// classpath 相当于 target所在目录
		Resource resource = laoder.getResource("classpath:com/xxx/service/test.txt");
		
		try {
			System.out.println("resoultLoader加载的内容为:"+IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
