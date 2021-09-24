package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Amount;
        int i = 1;
        Amount = input.nextInt();
        while (i < Amount) {
            int j = 1;
            while (j < i) {
                System.out.print(j);
                j ++;

            }
            System.out.println(i);
            i++;

        }
        while (i > 0) {
            int j = 1;
            while (j < i) {
                System.out.print(j);
                j++;

            }
            System.out.println(i);
            i=i-1;
        }



    }
}
