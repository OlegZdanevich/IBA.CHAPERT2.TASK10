package com.company;


import java.util.ArrayList;
import java.util.Collections;


public class MatrixSort {
    protected double[][] matrix = null;
    protected int size = 0;

    MatrixSort(int size) {
        try {
            if (size <= 0) throw new IllegalArgumentException("Size must be greater then zero");
            this.size = size;
            matrix = new double[size][size];
            generateRandomMatrix();

        } catch (IllegalArgumentException e) {
            StackTraceElement[] info = e.getStackTrace();
            for (int i = info.length - 1; i >= 0; i--) {
                System.err.println(info[i].toString());
            }
            System.err.println(e);
        }
    }

    public void sort(int k) {
        try {
            if (k < 0) throw new IllegalArgumentException("K must be greater then zero");
            if (k >= size) throw new IllegalArgumentException("Size must be greater then column");
            ArrayList<LineAndElement> arr=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arr.add(new LineAndElement(matrix[i][k], matrix[i]));
            }
            Collections.sort(arr,new LineAndElementComp());
            int counter = 0;
            for (LineAndElement element : arr) {
                matrix[counter] = element.getElements().clone();
                counter++;
            }
        } catch (IllegalArgumentException e) {
            StackTraceElement[] info = e.getStackTrace();
            for (int i = info.length - 1; i >= 0; i--) {
                System.err.println(info[i].toString());
            }
            System.err.println(e);
        }
    }

    @Override
    public String toString() {

        StringBuilder toReturn = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                toReturn.append(matrix[i][k] + ", ");
            }
            toReturn.append("\n");
        }
        return toReturn.toString();
    }

    private void generateRandomMatrix() {
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                matrix[i][k] = +(Math.random() * (size * 2 + 1)) - size;
            }
        }
    }

}
