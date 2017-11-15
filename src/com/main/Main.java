package com.main;

import com.company.MatrixSortAndDelete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = input.nextInt();
        MatrixSortAndDelete matrix = new MatrixSortAndDelete(n);
        System.out.println("Before delete:");
        System.out.println(matrix);
        matrix.delete();
        System.out.println("After delete:");
        System.out.println(matrix);
    }
}
