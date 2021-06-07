/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise13 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the principal amount?");
        double p = scan.nextDouble();
        System.out.println("What is the rate?");
        double r = scan.nextDouble()/100;
        System.out.println("What is the number of years?");
        double t = scan.nextDouble();
        System.out.println("What is the number of times the interest is compounded per year?");
        double n = scan.nextDouble();
        double x = p*(1+(r/n));
        double y = n*t;
        double a = Math.pow(p*(1+(r/n)), n*t);
        System.out.println("$"+p+" invested at "+r*100+"% for "+t+" years compounded "+n+" times per year is $"+a+".");
    }
}