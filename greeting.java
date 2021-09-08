package com.company;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number you want to check:");
        String s = input.nextLine();
        System.out.println("Greetings Mr/Mrs " + s);
    }
}
