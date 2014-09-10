package com.threepoundhealth.rest.validation;

import com.threepoundhealth.rest.model.Person;
import com.threepoundhealth.rest.validation.regex.EmailValidator;
import com.threepoundhealth.rest.validation.regex.PasswordValidator;
import com.threepoundhealth.rest.validation.regex.UrlValidation;

public class Validations {

	public boolean validPerson(Person person) {
		boolean isValid = true;
		
		//Checks on if the first name is a valid input.
		if(person.getFirstName() == null || "".equals(person.getFirstName()) || person.getFirstName().length() > 50) {
			isValid = false;
			System.out.println(person.getFirstName() + " is an invalid first name!");
		} 
		
		//Checks on if the last name is a valid input
		if(person.getLastName() == null || "".equals(person.getLastName()) || person.getLastName().length() > 50) {
			isValid = false;
			System.out.println(person.getLastName() + " is an invalid last name!");
		}
		
		//Checks to see if the age input is valid
		if (person.getAge() <= 0) {
			isValid = false;
			System.out.println(person.getAge() + " is an invalid age!");
		} 
		
		//validate email
		EmailValidator ev = new EmailValidator();
		if(person.getEmail() == null ||!ev.validate(person.getEmail())) {
			isValid = false;
			System.out.println(person.getEmail() + " is an invalid email!");
		}
		
		//Check to see if bio input is valid
		if(person.getBio() == null || "".equals(person.getBio()) || person.getBio().length() > 250) {
			isValid = false;
			System.out.println(person.getBio() + " is an invalid bio!");
		} 
		
		//Check to see if professional bio input is valid
		if(person.getProfessionalBio() == null || "".equals(person.getProfessionalBio()) || person.getProfessionalBio().length() > 250) {
			isValid = false;
			System.out.println(person.getProfessionalBio() + " is an invalid professional bio!");
		} 

		//Password Validation
		PasswordValidator pv = new PasswordValidator();
		if( person.getPassword() == null || !pv.validate(person.getPassword())) {
			isValid = false;
			System.out.println(person.getPassword() + " is an invalid password!");
		} 
		
		//URL Validation
		UrlValidation uv = new UrlValidation();
		if(person.getPicture_url() == null || !uv.validate(person.getPicture_url())){
			isValid = false;
			System.out.println(person.getPicture_url() + " is an invalid URL!");
		}
		return isValid;
	}
}