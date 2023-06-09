package com.pankz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	//	Triangle triangle=new Triangle();
		//triangle.draw();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Using Application Context
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
		
		
		//In this we need not to pass filesystem resource as parameter
		//XmlBeanFactory reads an XML file.It takes an args which is the resource where file is stored
		//Bean factory is an interfaces
		//there are different BeanFactory implementation ,here we re using XmlBeanFactory(class).
		//BeanFactory reads the blueprints of the beans from the configuration file(spring.xml)
	// Triangle triangle=(Triangle)context.getBean("triangle1"); //getting bean i.e obj "triangle"/ instantiating object here
		// triangle.draw();
	 //BeanFactory goes to xml file & it looks for "triangle" bean.
	// Circle circle=(Circle)context.getBean("circle");
		// circle.draw();
		Shape shape=(Shape)context.getBean("circle");  //coding to interface "Shape"
		//Here DrawingApp doesn't know whether it is drawing triangle or a circle due to coding to interface.
		//Can add rectangle classes if needed
		shape.draw();
		//System.out.println(context.getMessage("greetings",null,"Default Greeting",null));
	
	

	}

}
//What is "Beans"---->In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. 
//A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. 
//Otherwise, a bean is simply one of many objects in your application.
