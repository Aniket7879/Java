package com.company;

import java.util.Scanner;

public class CWH_12_CH2_PS2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Chapter 2 Video 12 Practice set 2

        //Question 2 : Encrypt a grade by adding 8 to it and decrypt it show correct grade
        // Encrypting the grade
        char grade = 'A';
        char gradeEncrypted = (char)(grade + 8);// (char) means we did type casting which means grade + 8 value
                                                // output we want as a character char + int gives output as int
                                                // so that's why we did type casting
        System.out.println(gradeEncrypted);

        // Decrypting the grade
        char grade1 = (char)(gradeEncrypted - 8);
        System.out.println(grade1);


        //Question 1 : solve the below operation
        float a = 7/4 * 9/2;// here it will print 4 as per mathematical calculation it will come 7.875
        // but integer evaluating another integer will give us output as integer only
        // a = 1.75 * 9/2
        // a =
        // a = 15.75
        System.out.println(a);

        // so the correct way is
        float b = 7/4.0f * 9/2.0f;
        System.out.println(b);


        // Question 3 : Use comparison operator for given number is greater than the user entered the number or not
        int number = 5;
        System.out.println("Enter the number to compare : ");
        int a1 = sc.nextInt();
        boolean a2 = number > a1;
        System.out.println(a2);

        // Question 4 : solve below operation
        float a3 = 9;
        float a4 = 3;
        float a5 = 2;
        float a6 = 4;

        float a7 = ( ( a3 * a3 ) - ( a4 * a4 ) ) / ( 2 * a5 * a6);
        System.out.println(a7);

        // Question 5 : solve below operation
        int x = 7;
        int x1 = 7*49 / 7 + 35/7;

        System.out.println(x1);


    }



}
