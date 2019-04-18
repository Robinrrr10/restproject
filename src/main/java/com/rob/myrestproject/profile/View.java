package com.rob.myrestproject.profile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/view")
public class View {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getProfile() {
		String profile = "<HTML><BODY><H2>Profile viw is also working</H2></BODY></HTML>";
		return profile;
	}
}
