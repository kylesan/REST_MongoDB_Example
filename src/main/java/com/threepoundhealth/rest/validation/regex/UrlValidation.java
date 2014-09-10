package com.threepoundhealth.rest.validation.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UrlValidation {
	
	private Pattern pattern;
	private Matcher matcher;
	
	public static final String URL_PATTERN = "^(((ht|f)tp(s?))\\://)?(www.|[a-zA-Z].)[a-zA-Z0-9\\-\\.]+\\.(com|edu|gov|mil|net|org|biz|info|name|museum|us|ca|uk)(\\:[0-9]+)*(/($|[a-zA-Z0-9\\.\\,\\;\\?\\'\\\\+&amp;%\\$#\\=~_\\-]+))*$";

	public UrlValidation(){
		  pattern = Pattern.compile(URL_PATTERN);
	  }

	  /**
	   * Validate password with regular expression
	   * @param password password for validation
	   * @return true valid password, false invalid password
	   */
	  public boolean validate(final String url){

		  matcher = pattern.matcher(url);
		  return matcher.matches();

	  }
}