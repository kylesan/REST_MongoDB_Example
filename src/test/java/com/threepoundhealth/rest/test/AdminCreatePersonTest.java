package com.threepoundhealth.rest.test;


import java.util.Date;

import org.junit.Test;

import com.threepoundhealth.rest.enums.Gender;
import com.threepoundhealth.rest.enums.Role;
import com.threepoundhealth.rest.model.Person;
import com.threepoundhealth.rest.service.impl.AdminResource;


public class AdminCreatePersonTest {
	
	Person person = new Person();
	private AdminResource resource = new AdminResource(person);

	// Tests create person method to push data through.
	@Test
	public void createTest() {
		
		//date
		Date date = new Date(80, 1, 27);
		
		person.set_id(200);
		person.setFirstName("admin");
		person.setLastName("user");
		person.setDob(date);
		person.setAge(34);
		person.setBio("bio");
		person.setProfessionalBio("professional bio");
		person.setEmail("admin@3poundhealth.com");
		person.setPassword("admin1234");
		person.setGender(Gender.Male.name());
		person.setRole(Role.Admin.name());
		person.setPicture_url("www.google.com");
		
		try {
			resource.createPerson(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}