package com.company.Logic.IndexAndElement;

import java.util.Comparator;

import com.company.Exceptions.Exceptions;


public class IndexAndElementComp implements Comparator<IndexAndElement> {

    public int compare(IndexAndElement firstElement, IndexAndElement secondElement) {
        try {
            if (firstElement == null) throw new NullPointerException("Object should be initialized");
            if (secondElement == null) throw new NullPointerException("Object should be initialized");

            if (firstElement.getElement() > secondElement.getElement()) {
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