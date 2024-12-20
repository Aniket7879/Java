package com.company;
import java.util.Scanner;


public class CBSCPercentage {

    public static void main (String[] args) {

        float totalMarks = 100F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Full Name : ");
        String name = sc.nextLine();
        System.out.println("Enter English Subject Marks : ");
        float english = sc.nextFloat();
        System.out.println(english);
        System.out.println("Enter Marathi Subject Marks : ");
        float marathi = sc.nextFloat();
        System.out.println("Enter Hindi Subject Marks : ");
        float hindi = sc.nextFloat();
        System.out.println("Enter Algebra Subject Marks : ");
        float algebra = sc.nextFloat();
        System.out.println("Enter Geometry Subject Marks : ");
        float geometry = sc.nextFloat();

        double sum = ((english + marathi + hindi + algebra + geometry)/100)*100;

        System.out.println(name + " got " + sum + " % out of " + totalMarks + "%");



    }


}
