package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the n:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int Changes = 0;
        int step = n;


        for (int i = 0; i < n * n; i++) {
            matrix[row][col] = i + 1;
            if (--step == 0) {
                int a = -(Changes / 2 - 1)-2;
                step = n + a;
                int temp = dx;
                dx = -dy;
                dy = temp;
                Changes++;
            }
            col += dx;
            row += dy;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }







    }
}
