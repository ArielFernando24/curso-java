/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  br.com.ariel.curso_java.exception.ExceptionResponse
 */
package br.com.ariel.curso_java.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {
    private final Date timestamp;
    private final String message;
    private final String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date timestamp() {
        return this.timestamp;
    }

    public String message() {
        return this.message;
    }

    public String details() {
        return this.details;
    }
}

