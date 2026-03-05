package com.validator;

public interface Validator {
	public void validate(String value) throws InvalidDataException;
}
