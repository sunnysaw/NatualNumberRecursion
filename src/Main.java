/*
Question : Write a java program to print all natural number from 1 to n by using recursion.
 */

import java.util.Scanner;

public class Main {
    static void NaturalNumber(int EndingDigit){
        if (EndingDigit <= 0){
            System.out.println(1);
            return;
        }
        NaturalNumber(EndingDigit - 1);
        System.out.println(EndingDigit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for printing the natural number : ");
        int EndingDigit = sc.nextInt();
        System.out.println("Printing result :");
        NaturalNumber(EndingDigit);
    }
}