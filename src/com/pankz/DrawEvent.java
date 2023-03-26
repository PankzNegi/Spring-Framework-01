package com.pankz;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
		
	}

	@Override
	public String toString() {
		return "Draw Event Occured"; //We are looking for this message when we are listening
	}

}
