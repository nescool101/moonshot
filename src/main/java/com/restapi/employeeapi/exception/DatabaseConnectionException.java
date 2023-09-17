package com.restapi.employeeapi.exception;


public class DatabaseConnectionException extends RuntimeException {
	public DatabaseConnectionException(String message) {
		super(message);
	}
}