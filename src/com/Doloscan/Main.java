package com.Doloscan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        squareOfAsterisks();
    }

    static void squareOfAsterisks() {
        int side;

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter side =>");
        side = scr.nextInt();

        String asterisk = "*";

        for (int i = 1; i < side; i++) {
            asterisk += " *";
        }
        for (int j = 0; j < side; j++) {
            System.out.println(asterisk);
        }
    }

}
