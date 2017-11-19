package com.company.Logic.LineAndElement;


import com.company.Exceptions.Exceptions;

public class LineAndElement {
    private double elementOfLine;
    private double[] line = null;

    public LineAndElement(double elementOfLine, double[] line) {
        try {
            if (line == null) throw new NullPointerException("Line should be initialized");

            this.elementOfLine = elementOfLine;
            this.line = line.clone();
        } catch (NullPointerException exception) {
            Exceptions.notInitializedException(exception);
            line = new double[1];
            line[0] = 0;
        }

    }

    public double getElementOfLine() {
        return elementOfLine;
    }

    public double[] getLine() {
        return line;
    }
}