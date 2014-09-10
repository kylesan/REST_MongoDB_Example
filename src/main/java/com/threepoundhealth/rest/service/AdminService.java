package com.threepoundhealth.rest.service;

import java.net.UnknownHostException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.threepoundhealth.rest.exception.NoResultsFoundException;
import com.threepoundhealth.rest.model.Person;

@Path("/people")
@Produces(MediaType.APPLICATION_JSON)
public interface AdminService {

	@POST
	void createPerson(Person person) throws NoResultsFoundException, UnknownHostException;

}