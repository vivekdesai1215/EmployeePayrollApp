package com.validator;



public class EmailValidator implements Validator{
	public void validate(String email) throws InvalidDataException{
	    final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	    
	    if(!email.matches(EMAIL_REGEX)) {
	    	throw new InvalidDataException("Email is Invalid !");
	    }
	}
}
