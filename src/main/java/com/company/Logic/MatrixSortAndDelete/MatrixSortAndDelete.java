package com.company.Logic.MatrixSortAndDelete;


import com.company.Logic.IndexAndElement.IndexAndElement;
import com.company.Logic.IndexAndElement.IndexAndElementComp;
import com.company.Logic.MatrixSort.MatrixSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MatrixSortAndDelete extends MatrixSort {

    private int width;

    public MatrixSortAndDelete(int size) {
        super(size);
        this.width = size;
    }

    public void delete() {
        ArrayList<Integer> indexes = findMax();

        int lenght = indexes.size();

        double[][] bufferMatrix = new double[size - indexes.size()][size];
        int k = 0;

        for (int i = 0; i < size; i++) {

            if (indexes.indexOf(i) == -1) {
                bufferMatrix[k] = matrix[i].clone();
                k++;
            } else {
                indexes.remove(indexes.indexOf(i));
            }

        }


        size -= lenght;
        matrix = bufferMatrix.clone();

    }

    @Override
    public String toString() {

        StringBuilder toReturn = new StringBuilder();
        for (int i = 0; i < size; i++) {

            for (int k = 0; k < width; k++) {
                toReturn.append(matrix[i][k] + ", ");
            }

            toReturn.append("\n");
        }
        return toReturn.toString();
    }

    private ArrayList<Integer> findMax() {
        double[][] buffer = new double[size][];

        for (int i = 0; i < size; i++) {
            buffer[i] = matrix[i].clone();
        }

        ArrayList<IndexAndElement> arrayOfIndexesWithElements = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Arrays.sort(buffer[i]);
            arrayOfIndexesWithElements.add(new IndexAndElement(i, buffer[i][size - 1]));
        }

        Collections.sort(arrayOfIndexesWithElements, new IndexAndElementComp());

        ArrayList<Integer> arrayOfIndexes = new ArrayList<>();
        arrayOfIndexes.add(arrayOfIndexesWithElements.get(size - 1).getIndex());

        for (int i = size - 2; i >= 0; i--) {
            if (arrayOfIndexesWithElements.get(size - 1).getElement() == arrayOfIndexesWithElements.get(i).getElement())
            {
                arrayOfIndexes.add(arrayOfIndexesWithElements.get(i).getIndex());
            }
            else break;
        }

        return arrayOfIndexes;
    }
}
