package com.company;

import java.util.Scanner;

public class CWH_13_Strings {

    public static void main(String[] args) {

        // A String is a class not a Primitive data type but can be used as a Primitive data type
        String name = new String("Aniket");
        System.out.println(name);
        String name1 = "Aniket";
        System.out.println(name1);// this will print with space
        //Strings are immutable and cannot be changed if you want to change Aniket to Anaket to same object
        // you cannot do that you can create a another copy but you cannot change the same object
        System.out.print(name);// This will print directly without showing any space
        int a = 6;
        float b = 3423.343f;
        System.out.printf("The Value of a is %d and value of b is %f",a,b);//here it is way of printing wiht printf
        // the %d and %f are format specifiers
        // %d is used for int, %f for float, %c for char, %s for String
        System.out.format("The Value of a is %d and value of b is %f",a,b);// it will work same as printf but it will
        // not show space in console

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();// here what ever you type in console it will go in st and print it
        System.out.println(st);
        System.out.format("The Value of a is %d and value of b is %.2f",a,b);// using %.2f it will give the output
        // in 2 pointers only eg instead of 3423.343018 it will print 3423.34
        System.out.format("The Value of a is %d and value of b is %8.2f",a,b);// using %8.2f will print including
        // 8 spaces

    }


}
