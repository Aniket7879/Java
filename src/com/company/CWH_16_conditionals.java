package com.company;
import java.util.Scanner;
public class CWH_16_conditionals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        Conditional Statements and Relational Operators

        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Yes your Age is eligible for Driving");
        }else{
            System.out.println("You are not 18 or 18+ Age to Drive Yet, We are Really Sorry");
        }

//        System.out.println("Enter Your Age : ");
//        int age = sc.nextInt();
//        // Conditions are opposite now
//        if(age!=18){
//            System.out.println("Yes your Age is eligible for Driving");
//        }else{
//            System.out.println("You are not 18 or 18+ Age to Drive Yet, We are Really Sorry");
//        }
//
//        System.out.println("Enter Your Age : ");
//        int age = sc.nextInt();
//        // Conditions are opposite now
//        if(age==18){
//            System.out.println("Yes your Age is eligible for Driving");
//        }else{
//            System.out.println("You are not 18 or 18+ Age to Drive Yet, We are Really Sorry");
//        }


    }



}
