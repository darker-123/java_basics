package com.company;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number you want to check:");
        int n = input.nextInt();
        if (n%2 == 0){
            System.out.println("the " + n + " number is even");
        }
        else{
            System.out.println("the " + n + " number is odd");
        }
    }
}
