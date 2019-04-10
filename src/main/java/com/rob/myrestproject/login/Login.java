package com.rob.myrestproject.login;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rob.myrestproject.login.entry.LoginEntry;
import com.rob.myrestproject.login.entry.LoginResponse;

@Path("/login")
public class Login {

	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public LoginResponse doSignIn(LoginEntry loginEntry) {
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setName("Prabu");
		loginResponse.setLoginResult("Login Unsuccessfull. Please give correct credential");
		if(loginEntry.getUserId().equals("Prabu") && loginEntry.getPassword().equals("12345")) {
			loginResponse.setLoginResult("Login Successfull.");
		}
		return loginResponse;
	}

}
