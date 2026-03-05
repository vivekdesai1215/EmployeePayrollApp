package com.validator;

public class EmpIdValidator implements Validator{
	public void validate(String empId) throws InvalidDataException{
		String regex = "^EMP-\\d+$";
		if(!empId.matches(regex)) {
			throw new InvalidDataException("Emp Id is Invalid");
		}
	}
}
