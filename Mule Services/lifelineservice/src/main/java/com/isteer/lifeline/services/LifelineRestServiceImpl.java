package com.isteer.lifeline.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.mule.DefaultMuleMessage;
import org.mule.api.MuleContext;
import org.mule.api.MuleMessage;
import org.mule.api.annotations.param.Payload;

import com.isteer.lifeline.pojos.BloodRequest;
import com.isteer.lifeline.pojos.UserRequest;

@Path("/Lifeline")
public class LifelineRestServiceImpl {
	
	@Path("/addUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	

	public UserRequest newUser(@Payload UserRequest req){
		System.out.println("New user Request");
		System.out.println(req.getLoginID());
		return req;
	}
	
	@Path("/bloodRequest")
	@POST
	@Consumes("application/json")
	@Produces("application/json")

	public BloodRequest bloodRequest(@Payload BloodRequest req){
		System.out.println("New Blood Request");
		System.out.println(req);
		return req;
	}
	
	
	
}
