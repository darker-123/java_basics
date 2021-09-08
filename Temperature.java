package com.company;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the Temperature in Celsius:");
        float tempc, tempf;
        tempc = input.nextFloat();
        tempf = (tempc * 9/5) + 32;
        System.out.println("Your Temperature in farenheit: " + tempf);
    }
}
