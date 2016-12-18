package ru.javawebinar.topjava.util.exception;

/**
 * Created by dimas on 03.12.16.
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
