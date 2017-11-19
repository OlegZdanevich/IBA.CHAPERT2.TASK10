package com.company.Logic.LineAndElement;

import com.company.Exceptions.Exceptions;

import java.util.Comparator;

public class LineAndElementComp implements Comparator<LineAndElement> {

    public int compare(LineAndElement firstElement, LineAndElement secondElement) {
        try {
            if (firstElement == null) throw new NullPointerException("Object should be initialized");
            if (secondElement == null) throw new NullPointerException("Object should be initialized");

            if (firstElement.getElementOfLine() > secondElement.getElementOfLine()) {
                return 1;
            } else {
                return -1;
            }
        } catch (NullPointerException exception) {
            Exceptions.notInitializedException(exception);
            return 0;
        }

    }

}