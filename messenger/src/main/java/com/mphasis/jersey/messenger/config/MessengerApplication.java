package com.mphasis.jersey.messenger.config;

import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/webapi")
public class MessengerApplication extends ResourceConfig {
	public MessengerApplication() {
		// TODO Auto-generated constructor stub
		System.out.println("Application Created");
		packages("com.mphasis.jersey.messenger");
	}

}
