package org.example.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    protected Logger logger = LoggerFactory.getLogger(getClass());


    @ExceptionHandler({AccessDeniedException.class})
    protected ResponseEntity<Object> handleAccessDeniedException(AccessDeniedException accessDeniedException){

        ApiEr apiEr = new ApiEr(accessDeniedException.getMessage(), HttpStatus.FORBIDDEN);

        return buildResponseEntity(apiEr);

    }

    private ResponseEntity<Object> buildResponseEntity(ApiEr apiEr)
    {
        return new ResponseEntity<>(apiEr,apiEr.getHttpStatus());
    }
}
