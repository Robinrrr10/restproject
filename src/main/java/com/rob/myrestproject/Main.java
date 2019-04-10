package com.rob.myrestproject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/main")
public class Main {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String checking() {
		return "<HTML><BODY><H>Hello. This is working fine</H></BODY></HTML>";
	}
}
