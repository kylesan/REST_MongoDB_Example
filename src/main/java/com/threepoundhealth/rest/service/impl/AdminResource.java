package com.threepoundhealth.rest.service.impl;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.threepoundhealth.rest.exception.NoResultsFoundException;
import com.threepoundhealth.rest.model.Person;
import com.threepoundhealth.rest.mongoutilities.MongoUtil;
import com.threepoundhealth.rest.service.AdminService;

import com.threepoundhealth.rest.validation.Validations;

public class AdminResource implements AdminService {

	private Person person;
	private Mongo mongo;
	private Validations validator = new Validations();
	private String dbName;
	private String collectionName;
	public AdminResource(Person person) {
		this.person = person;
	}

	@Override
	public void createPerson(Person person) throws NoResultsFoundException,
			UnknownHostException {

		mongo = MongoUtil.getMongo();
		dbName = MongoUtil.getDB();
		collectionName = MongoUtil.getCollection();
		DB db = mongo.getDB(dbName);
		DBCollection collection = db.getCollection(collectionName);
		
		//Insert the data IF all inputs are valid.
		if (validator.validPerson(person)) {
			try {
				// Assembling the document
				BasicDBObject document = new BasicDBObject();
				document.put("FN", person.getFirstName());
				document.put("LN", person.getLastName());
				document.put("age", person.getAge());
				document.put("email", person.getEmail());
				document.put("_id", person.get_id());
				document.put("PW", person.getPassword());
				document.put("dob", person.getDob());
				document.put("bio", person.getBio());
				document.put("PBIO", person.getProfessionalBio());
				document.put("URL", person.getPicture_url());
				document.put("gender", person.getGender());
				document.put("role", person.getRole());

				// Execute Query
				collection.insert(document);

			} catch (Exception e) {
				throw new NoResultsFoundException("Record Not Created", e);
			}
		}
	}

}