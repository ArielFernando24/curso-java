/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.exception.ExceptionResponse
 *  br.com.ariel.curso_java.exception.ResourceNotFoundException
 *  br.com.ariel.curso_java.exception.handler.CustomEntityResponseHandler
 *  org.springframework.http.HttpStatus
 *  org.springframework.http.HttpStatusCode
 *  org.springframework.http.ResponseEntity
 *  org.springframework.web.bind.annotation.ControllerAdvice
 *  org.springframework.web.bind.annotation.ExceptionHandler
 *  org.springframework.web.bind.annotation.RestController
 *  org.springframework.web.context.request.WebRequest
 *  org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
 */
package br.com.ariel.curso_java.exception.handler;

import br.com.ariel.curso_java.exception.ExceptionResponse;
import br.com.ariel.curso_java.exception.ResourceNotFoundException;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomEntityResponseHandler
extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value={Exception.class})
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity((Object)response, (HttpStatusCode)HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value={ResourceNotFoundException.class})
    public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions(Exception ex, WebRequest request) {
        ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity((Object)response, (HttpStatusCode)HttpStatus.NOT_FOUND);
    }
}

