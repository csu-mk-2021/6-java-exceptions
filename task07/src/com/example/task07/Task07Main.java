package com.example.task07;
import java.io.IOException;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
            return NONE;
        } catch (IOException e) {
            return CHECKED;
        } catch (Exception e) {
            return UNCHECKED;
        }
    }
}