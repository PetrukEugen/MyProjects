package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[] stepm = new int[n+n];
        int row = 0;
        int col = 0;
        int dx = 0;
        int dy = 1;
        int Changes = 0;
        int step = n;
        int tempcol =0;
        int temprow =0;
        int b = 2;
        stepm[0]= 0;
        stepm[0]= n-1;


        for (int i = 0; i < n * n; i++) {
            matrix[row][col] = i + 1;
            if (--step == 0) {
                int a = -(Changes / 2 - 1)-2;
                step = n + a;
                if (step >0) {
                    stepm[b] = step;
                }
                int temp = dy;
                dy = -dx;
                dx = temp;
                Changes++;
                b++;
            }
            tempcol = col;
            temprow = row;
            col += dx;
            row += dy;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }


        System.out.print("\n"+"Revers:"+ "\n"+"\n");

        col = tempcol;
        row = temprow;
        int lgmass = stepm.length-1;
        int step2 = stepm[lgmass];
        Changes = 0;
        dx=-dx;


        for (int i = 0; i < (n * n); i++) {
            matrix[row][col] = i + 1;
            if (--step2 == 0) {
                step2 = stepm[lgmass - Changes];
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
        /*for (int i = 0; i < stepm.length; i++) {

                System.out.print(stepm[i] + "\t");

        }*/

    }
}

