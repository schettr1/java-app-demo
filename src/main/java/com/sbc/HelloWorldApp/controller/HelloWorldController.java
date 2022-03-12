package com.sbc.HelloWorldApp.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String hello() {
		//StringBuilder message = new StringBuilder("Hello World!");
		StringBuilder message = new StringBuilder("Hello World Demo Application!");
	    try {
	      InetAddress ip = InetAddress.getLocalHost();
	      message.append(" From host: " + ip);
	    } catch (UnknownHostException e) {
	      e.printStackTrace();
	    }
	      return message.toString();
	    }
}
