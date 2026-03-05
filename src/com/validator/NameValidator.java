package com.validator;

public class NameValidator implements Validator{
	public void validate(String name) throws InvalidDataException{
		String regex = "^[A-Za-z]{2,}$";
		if(!name.matches(regex)) {
			throw new InvalidDataException("Name is Invalid !!");
		}
	}
}
