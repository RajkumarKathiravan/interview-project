package com.emailsend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(UserNameAlreadyExistsException.class)
    public ResponseEntity<Object> handleUsername(UserNameAlreadyExistsException une) {
        return new ResponseEntity<>(une.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<Object> handleEmail(EmailAlreadyExistsException ee) {
        return new ResponseEntity<>(ee.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
