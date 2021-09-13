package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "How many euros are you exchanging?" );
        int euros = input.nextInt();

        System.out.println( "What is the exchange rate?" );

        float rate = input.nextFloat();

        double usd = euros*rate;

        System.out.printf("%d euros at an exchange rate of %f is \n%.2f U.S. dollars.", euros, rate, usd);
    }
}
