package com.validator;

public class PhoneValidator implements Validator{
	public void validate(String phoneNo) throws InvalidDataException{
		String regex = "^\\d{10}$";
		if(!phoneNo.matches(regex)) {
			throw new InvalidDataException("Phone No is Invalid");
		}
	}
}
