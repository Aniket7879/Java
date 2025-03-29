package com.company;

import java.util.Scanner;

public class CWH_18_elseif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        //this if else if else condition known as if else if ladder statement
        // instead of using if inside if as a nested if use ladder statement
        if(age>56){
            System.out.println("Your are Semi-Semi Experienced");
        }
        else if(age>46){
            System.out.println("Your are Semi Experienced");
        }
        else if(age>36){
            System.out.println("Your are Experienced");
        }
        else {
            System.out.println("You are not Experienced");
        }

        // this if condition will not join the ladder it will consider as a seperate condition
         if(age>36){
            System.out.println("Your are Experienced");
        }

        System.out.println("Enter Your Age : ");
        int age1 = sc.nextInt();
        switch (age1){
            case 18:
                System.out.println("You are going to become an Adult");
                break;//break means after executing the before line get out of the switch case and ignore below cases
            case 23:
                System.out.println("You are going to get an Job");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life!");// if all conditions failed it will execute default statement

        }
        System.out.println("Thanks for using this JAVA Program");

        //Enhanced Switch reduces lines of code and doesn't require break it will automatically have break inbuilt
        System.out.println("Enter Your Age : ");
        int age2 = sc.nextInt();
        switch (age2) {
            case 18 -> {
                System.out.println("You are going to become an Adult");
                System.out.println("You are going to become an Adult");
                System.out.println("You are going to become an Adult");
            }
            case 23 -> System.out.println("You are going to get an Job");
            case 60 -> System.out.println("You are going to get retired");
            default ->
                    System.out.println("Enjoy your life!");// if all conditions failed it will execute default statement
        }
        System.out.println("Thanks for using this JAVA Program");

        System.out.println("Enter Your Age : ");
        // var can be integer, character or String in Java
        int var = sc.nextInt();
//        char var = 'A';
//        String var = "Aniket";
        switch (var){
            case 18:
                System.out.println("You are going to become an Adult");
                break;//break means after executing the before line get out of the switch case and ignore below cases
            case 23:
                System.out.println("You are going to get an Job");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life!");// if all conditions failed it will execute default statement

        }
        System.out.println("Thanks for using this JAVA Program");

    }

}
