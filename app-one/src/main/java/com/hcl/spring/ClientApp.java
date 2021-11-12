package com.hcl.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class ClientApp {

	public static void main(String[] args) {

		Resource resource = new FileSystemResource("src/main/java/com/hcl/spring/resources/spring-config.xml");
		BeanFactory ioc = new XmlBeanFactory(resource);

		Object bean = ioc.getBean("h");

		HelloWorld obj = (HelloWorld) bean;

		System.out.println(obj.getMessage());

	}

}
