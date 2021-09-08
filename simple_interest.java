package com.company;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Eneter the Value to find the Simple interest");
        float P,T,R,A;
        System.out.println("enter the principle: ");
        P = in.nextFloat();
        System.out.println("enter the time: ");
        T = in.nextFloat();
        System.out.println("enter the rate: ");
        R = in.nextFloat();
        System.out.println(P*(1 + T*R));
    }
}
