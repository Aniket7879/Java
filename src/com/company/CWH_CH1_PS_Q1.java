package com.company;
import java.util.Scanner;

public class CWH_CH1_PS_Q1 {

    public static void main (String[] args) {

        //Question 05 : Number entered by user is integer or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Number : ");
        boolean number = sc.hasNextInt();
        System.out.println(number);


        //Question 04 : Convert Kilometer to Miles
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Kilometers : ");
//        double kilometer = sc.nextDouble();
//        double miles = (kilometer)/1.609344;// Formula : number of miles = no of kilometers/1.609344
//        System.out.println("Your Conversion for Kilometer you entered : " + kilometer + " is converted into " +
//                miles + " miles" );


        //Question 03 : Ask person name and greet him
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Your Name (Him / Her) : ");
//        String name = sc.nextLine();
//        System.out.println("Hello " + name + "!!, Have a Good Day");



        //Question 02 : Calculate Students CGPA
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter English Subject 01 marks : ");
//        float englishSubject = sc.nextFloat();
//        System.out.println("Enter Marathi Subject 02 marks : ");
//        float marathiSubject = sc.nextFloat();
//        System.out.println("Enter Hindi Subject 03 marks : ");
//        float hindiSubject = sc.nextFloat();
//
//        double sum = (englishSubject + marathiSubject + hindiSubject)/30; // cgpa = total marks of subject/ no fo subject
//
//        System.out.println("Your CGPA is : " + sum);

        //Question 01 : Sum of adding 3 numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 01 : ");
//        int no1 = sc.nextInt();
//        System.out.println("Enter number 02 : ");
//        int no2 = sc.nextInt();
//        System.out.println("Enter Number 03 : ");
//        int no3 = sc.nextInt();
//
//        int sum = no1 + no2 + no3;
//        System.out.println("The Sum of the Numbers is : " + sum);


    }

}
