package com.mile1.exception;

public class NullNameException extends Exception {
    @Override
    public String toString() {
        return "name is null";
    }
}
