package com.restapi.employeeapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SoapConmectionException extends Exception {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public SoapConmectionException() {
        super("We are not able to connect to the SOAP service" );
    }
}
