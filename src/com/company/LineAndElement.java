package com.company;

public class LineAndElement
{
    private double element;
    private double[] elements=null;
    LineAndElement (double element, double[]elements)
    {
        this.element=element;
        this.elements=elements.clone();
    }

    public double getElement() {
        return element;
    }

    public double[] getElements() {
        return elements;
    }

}