package com.threepoundhealth.rest.test;

import java.util.Date;

import org.junit.Test;

import com.threepoundhealth.rest.enums.Gender;
import com.threepoundhealth.rest.enums.Role;
import com.threepoundhealth.rest.model.Person;
import com.threepoundhealth.rest.validation.Validations;


public class ValidationTest {
	
	Person person = new Person();
	Validations isValid = new Validations();
	Date date = new Date();
	private static final String badData = "12345678901234567890123456789012345678901234567890123" +
			"4567890123456789012345678901234567890123456789012345678" +
			"9012345678901234567890123456789012345678901234567890123" +
			"45678901234567890123456789012345678901234567890123456789" +
			"01234567890123456789012345678901234567890123456789012345678901234567890";
	
//	@Test
//	public void firstNameTest() {
//		
//		date = new Date(80, 1, 27);
//		person.set_id(100);
//		person.setFirstName("");
//		person.setLastName("user");
//		person.setDob(date);
//		person.setAge(34);
//		person.setBio("bio");
//		person.setProfessionalBio("professional bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setPassword("admin1234");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);	
//		
//		
//		person.set_id(100);
//		person.setFirstName(null);
//		person.setLastName("user");
//		person.setDob(date);
//		person.setAge(34);
//		person.setBio("bio");
//		person.setProfessionalBio("professional bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setPassword("admin1234");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		date = new Date(80, 1, 27);
//		
//		isValid.validPerson(person);
//
//		person.set_id(100);
//		person.setFirstName("admin123456789012345678901234567890123456789012345678901");
//		person.setLastName("user");
//		person.setDob(date);
//		person.setAge(34);
//		person.setBio("bio");
//		person.setProfessionalBio("professional bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setPassword("admin1234");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		date = new Date(80, 1, 27);
//		
//		isValid.validPerson(person);
//	}
//	
//	@Test
//	public void lastNameTest() {
//		
//		date = new Date(80, 1, 27);
//		person.set_id(100);
//		person.setFirstName("admin");
//		person.setLastName("");
//		person.setDob(date);
//		person.setAge(34);
//		person.setBio("bio");
//		person.setProfessionalBio("professional bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setPassword("admin1234");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		date = new Date(80, 1, 27);
//		person.set_id(100);
//		person.setFirstName("admin");
//		person.setLastName(null);
//		person.setDob(date);
//		person.setAge(34);
//		person.setBio("bio");
//		person.setProfessionalBio("professional bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setPassword("admin1234");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		date = new Date(80, 1, 27);
//		person.set_id(100);
//		person.setFirstName("admin");
//		person.setLastName("user123456789012345678901234567890123456789012345678901");
//		person.setDob(date);
//		person.setAge(34);
//		person.setBio("bio");
//		person.setProfessionalBio("professional bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setPassword("admin1234");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//	}
//	
//	@Test
//	public void ageTest(){
//		date = new Date(87,05,24);
//		person.set_id(100);
//		person.setAge(-1);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("admin1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		person.set_id(100);
//		person.setAge(0);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("admin1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//	}
//	
//	@Test
//	public void emailTest(){
//		
//		date = new Date(87,05,24);
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("123");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("admin1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		date = new Date(87,05,24);
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail(null);
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("admin1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//
//		isValid.validPerson(person);
//		
//		date = new Date(87,05,24);
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("admin1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//				
//		date = new Date(87,05,24);
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("test@3poundhealthcom");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("admin1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//	}
//	
//	@Test
//	public void passwordTest(){
//		date = new Date(87,05,24);
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		date = new Date(87,05,24);
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		date = new Date(87,05,24);
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword(null);
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		date = new Date(87,05,24);
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("a123");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		date = new Date(87,05,24);
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("asdfghjhgujk");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//	}
//	
//	@Test
//	public void BioTest(){
//		
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio(null);
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("asdf1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("asdf1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio(badData);
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("asdf1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("professional_bio");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//	}
//	
//	@Test
//	public void ProfessionalBioTest(){
//		
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("asdf1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio(null);
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("asdf1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio("");
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//		
//		person.set_id(100);
//		person.setAge(27);
//		person.setDob(date);
//		person.setBio("bio");
//		person.setEmail("admin@3poundhealth.com");
//		person.setFirstName("admin");
//		person.setLastName("3poundhealth");
//		person.setPassword("asdf1234");
//		person.setPicture_url("picture_url");
//		person.setProfessionalBio(badData);
//		person.setGender(Gender.Male.name());
//		person.setRole(Role.Admin.name());
//		
//		isValid.validPerson(person);
//	}
//	
	@Test
	public void urlTest() {
		person.set_id(100);
		person.setAge(27);
		person.setDob(date);
		person.setBio("bio");
		person.setEmail("admin@3poundhealth.com");
		person.setFirstName("admin");
		person.setLastName("3poundhealth");
		person.setPassword("asdf1234");
		person.setPicture_url("www.google.com");
		person.setProfessionalBio("Pro_Bio");
		person.setGender(Gender.Male.name());
		person.setRole(Role.Admin.name());
		
		isValid.validPerson(person);

		person.set_id(100);
		person.setAge(27);
		person.setDob(date);
		person.setBio("bio");
		person.setEmail("admin@3poundhealth.com");
		person.setFirstName("admin");
		person.setLastName("3poundhealth");
		person.setPassword("asdf1234");
		person.setPicture_url("www.googlecom");
		person.setProfessionalBio("Pro_Bio");
		person.setGender(Gender.Male.name());
		person.setRole(Role.Admin.name());
		
		isValid.validPerson(person);

		person.set_id(100);
		person.setAge(27);
		person.setDob(date);
		person.setBio("bio");
		person.setEmail("admin@3poundhealth.com");
		person.setFirstName("admin");
		person.setLastName("3poundhealth");
		person.setPassword("asdf1234");
		person.setPicture_url("");
		person.setProfessionalBio("Pro_Bio");
		person.setGender(Gender.Male.name());
		person.setRole(Role.Admin.name());
		
		isValid.validPerson(person);

		person.set_id(100);
		person.setAge(27);
		person.setDob(date);
		person.setBio("bio");
		person.setEmail("admin@3poundhealth.com");
		person.setFirstName("admin");
		person.setLastName("3poundhealth");
		person.setPassword("asdf1234");
		person.setPicture_url(null);
		person.setProfessionalBio("Pro_Bio");
		person.setGender(Gender.Male.name());
		person.setRole(Role.Admin.name());
		
		isValid.validPerson(person);

	}
}