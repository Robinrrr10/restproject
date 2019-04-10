package com.rob.myrestproject;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.rob.myrestproject.login.Login;

@ApplicationPath("v1")
public class AppConfig extends Application{

	private Set<Class<?>> resources = new HashSet<>();
	
	public AppConfig() {
		System.out.println("Created AppConfig");
		resources.add(Main.class);
		resources.add(Login.class);
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return resources;
	}
	

}
