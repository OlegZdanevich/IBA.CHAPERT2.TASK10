package com.company.Run;

import com.company.Exceptions.Exceptions;
import com.company.Logic.MatrixSortAndDelete.MatrixSortAndDelete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter size: ");
            int n = Integer.parseInt(input.next());

            MatrixSortAndDelete matrix = new MatrixSortAndDelete(n);

            System.out.println("Before delete:");
            System.out.println(matrix);

            matrix.delete();

            System.out.println("After delete:");
            System.out.println(matrix);
        } catch (NumberFormatException exception) {
            Exceptions.notNumberException(exception);
        } catch (NullPointerException exception) {
            Exceptions.notInitializedException(exception);
        }

    }
}
