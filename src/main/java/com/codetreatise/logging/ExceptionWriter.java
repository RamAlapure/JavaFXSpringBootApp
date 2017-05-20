
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package com.codetreatise.logging;

import java.io.PrintWriter;
import java.io.Writer;

/**
 * Handles writing exceptions to the Logger Tab and and utility methods needed
 * to facilitate logging of exceptions
 */
public class ExceptionWriter extends PrintWriter {
    public ExceptionWriter(Writer writer) {
        super(writer);
    }

    private String wrapAroundWithNewlines(String stringWithoutNewlines) {
        return ("\n" + stringWithoutNewlines + "\n");
    }

    /*
     * Convert a stacktrace into a string
     */
    public String getExceptionAsString(Throwable throwable) {
        throwable.printStackTrace(this);

        String exception = super.out.toString();

        return (wrapAroundWithNewlines(exception));
    }
}

