package com.pankz;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	
	public static void main(String[] args) {
	//	Triangle triangle=new Triangle();
		//triangle.draw();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Using Application Context
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//In this we need not to pass filesystem resource as parameter
		//XmlBeanFactory reads an XML file.It takes an args which is the resource where file is stored
		//Bean factory is an interfaces
		//there are different BeanFactory implementation ,here we re using XmlBeanFactory(class).
		//BeanFactory reads the blueprints of the beans from the configuration file(spring.xml)
	 Triangle triangle=(Triangle)context.getBean("triangle-alias"); //getting bean i.e obj "triangle"/ instantiating object here
	 //BeanFactory goes to xml file & it looks for "triangle" bean.
	 triangle.draw();

	}

}
//What is "Beans"---->In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. 
//A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. 
//Otherwise, a bean is simply one of many objects in your application.
