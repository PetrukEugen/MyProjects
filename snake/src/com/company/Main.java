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
        int step = n;
        int buff = n-1;
        int flag = 0;

        for (int i = 0; i < n * n; i++) {
            matrix[row][col] = i + 1;
            if (--step == 0) {

                if (buff==n-1){
                    buff = 1;
                }
                else {
                    buff = n-1;
                }
                step = buff;


                if (flag < 2){
                    int temp = dx;
                    dx = -dy;
                    dy = temp;
                    flag++;
                }
                else {
                    int temp = dy;
                    dy = -dx;
                    dx = temp;
                    flag++;
                    if (flag > 3){
                        flag = 0;
                    }

                }

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
