package com.jsp.springcore1;

//import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("spring_cnf.xml");
		BeanFactory bf = new XmlBeanFactory(resource); 
		Demo bean = bf.getBean(Demo.class);
		System.out.println(bean);
	}

}
