package com.schoolinfo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.schoolinfo.other.Apiresponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Apiresponse> resourceNotfoundExceptionhandler(ResourceNotFoundException ex){
		String message = ex.getMessage();
		Apiresponse api = new Apiresponse(message,false);
		return new ResponseEntity<Apiresponse>(api, HttpStatus.NOT_FOUND);
	}
}
