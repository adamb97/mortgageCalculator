package com.adam;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    final byte MONTHSTOYEAR = 12;
	    final byte PERCENTCONVERSION = 100;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principleInput = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interestInput = scanner.nextFloat();
        float monthlyInterest = interestInput / PERCENTCONVERSION / MONTHSTOYEAR;


        System.out.print("Period (in years): ");
        byte yearInput = scanner.nextByte();
        int monthsOfPayment = yearInput * MONTHSTOYEAR;

       double mortgage = principleInput * (monthlyInterest * Math.pow(1 + monthlyInterest, monthsOfPayment))
               / (Math.pow(1 + monthlyInterest, monthsOfPayment) - 1);

       String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

       System.out.println("Mortgage: " + formattedMortgage);

    }
}
