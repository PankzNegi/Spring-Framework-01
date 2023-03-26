package com.pankz;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class Circle implements Shape,ApplicationEventPublisherAware {
	private Point center;
	@Autowired   //as their is only bean of this id
	private MessageSource messagesource;
	private ApplicationEventPublisher publisher;
	

	public MessageSource getMessagesource() {
		return messagesource;
	}

	public void setMessagesource(MessageSource messagesource) {
		this.messagesource = messagesource;
	}

	public Point getCenter() {
		return center;
	}
	
/*	@Autowired
	@Qualifier("circleRelated")*/
	
	@Resource(name="point1")

	public void setCenter( Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		//System.out.println("Drawing Circle");
		System.out.println(this.messagesource.getMessage("drawing.circle", null,"Default Drawing Message",null));
		
		//System.out.println("Circle's Point is (" +center.getX() +"," +center.getY()+")");
		System.out.println(this.messagesource.getMessage("drawing.points", new Object[] {center.getX(),center.getY()},"Default Points",null));
		System.out.println(this.messagesource.getMessage("greetings",null,"Default Greeting",null));
		//Creating new Event
		DrawEvent drawEvent=new DrawEvent(this);
		//Publishing Event
		publisher.publishEvent(drawEvent);
	}
	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("Init of Circle");
	}
	@PreDestroy
	public void destroyCircle()
	{
		System.out.println("Destroy of Circle");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
		
	}


}

