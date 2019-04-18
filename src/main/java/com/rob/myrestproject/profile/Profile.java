package com.rob.myrestproject.profile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.robinrrr10.profilePojo.entry.ProfileEntry;
import com.github.robinrrr10.profilePojo.entry.ProfileResponse;
import com.github.robinrrr10.profilePojo.entry.Status;


@Produces(MediaType.APPLICATION_JSON)
@Path("/profile")
public class Profile {
	
	@Path("/{profileId}")
	@GET
	public ProfileResponse getProfile(@PathParam("profileId") String profileId) {
		System.out.println("profileId is :"+profileId);
		ProfileResponse profileResponse = new ProfileResponse();
		Status status = new Status();
		ProfileEntry profileEntity = new ProfileEntry();
		if(profileId.equals("12345")) {
			status.setStatusCode(10001);
			status.setStatusMessage("Profile received successfully");
			status.setStatusType("SUCCESS");
			profileResponse.setStatus(status);
			profileEntity.setName("Prabu");
			profileEntity.setAge("56");
			profileEntity.setAddress("Thisayanvilai");
			profileResponse.setProfileEntry(profileEntity);
		}else {
			status.setStatusCode(2003);
			status.setStatusMessage("Profile not available");
			status.setStatusType("ERROR");
			profileResponse.setStatus(status);
		}
		return profileResponse;
	}
	
}
