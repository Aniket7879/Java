package com.company;
import java.util.Scanner;
public class TakingInput {

public static void main (String[] args) {

    System.out.println("It Works");
    System.out.println("Taking inputs from the User");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number 01 : ");
    int a = sc.nextInt();
    System.out.println("Enter Number 02 : ");
    int b = sc.nextInt();

    System.out.println("Enter Number 03 : ");
    float c = sc.nextFloat();
    System.out.println("Enter Number 04 : ");
    float d = sc.nextFloat();

    int sum = a + b;
    System.out.println("The Sum of the numbers [ a & b ] is : " + sum);
    float sum2 = c + d;
    System.out.println("The Sum of the numbers [ c & d ] is : " + sum2);

    System.out.println("Enter your Integer : "); //entering the number to check whether it is integer or not
    boolean b1 = sc.hasNextInt(); //checking if the number you are entering is integer or not
    System.out.println(b1); // if it is integer it will print true or else false

    System.out.println("Enter your Full Name Again : ");
    String str1 = sc.nextLine(); //if you enter your full name "Aniket Kiran Gangurde" it will only print Aniket
    System.out.println(str1);

    System.out.println("Enter your Full Name : ");
    String str = sc.next();//if you enter your full name "Aniket Kiran Gangurde" it will print full name Aniket
                            //Kiran Gangurde
    System.out.println(str);



}



}
