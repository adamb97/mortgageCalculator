package com.adam;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    final byte MONTHSTOYEAR = 12;
	    final byte PERCENTCONVERSION = 100;
        int principleInput = 0;
        float monthlyInterest = 0;
        int monthsOfPayment = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal: ");
             principleInput = scanner.nextInt();
            if (principleInput >= 1000 && principleInput <= 1_000_000)
                break;
            System.out.println("Error: Please enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float interestInput = scanner.nextFloat();
            if (interestInput >= 1 && interestInput <= 30) {
                monthlyInterest = interestInput / PERCENTCONVERSION / MONTHSTOYEAR;
                break;
            }
            System.out.println("Error: please Enter a value between 1 and 30");



        }


        while (true) {
            System.out.print("Period (in years): ");
            byte yearInput = scanner.nextByte();
            if (yearInput >=1 && yearInput <= 30) {
                 monthsOfPayment = yearInput * MONTHSTOYEAR;
                break;
            }
            System.out.println("Error: Please enter a value between 1 and 30");
        }


       double mortgage = principleInput * (monthlyInterest * Math.pow(1 + monthlyInterest, monthsOfPayment))
               / (Math.pow(1 + monthlyInterest, monthsOfPayment) - 1);

       String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);

       System.out.println("Mortgage: " + formattedMortgage);

    }
}
