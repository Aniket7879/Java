package com.company;

public class CWH_CH02_Operators {

    public static void main(String[] args) {
        //Operators

        //arithmetic and assignment operators
        int a = 6 ;
        int b = 4 + a;
        int b1 = 6 - a;
        float b2 = 6 * a;
        float b3 = 6 / a;
        float b4 = 6 % a; // known as modulo operator, For example 6 / 4 the remainder comes as 2
        //basically it gives us the remainder value when we divided the numbers
        int b5 = 6;
        int b6 = b5 += 3;// " += " means add 3 to 6, simply saying add b3 to b5 value
        int b7 = 6;
        int b8 = b7 -= 3;// " -= " means subtract 3 from 6, simply saying subtracting 3 from b7 value
        int b9 = b5 *= 3;// " *= " means multiplying 3 to 6, simply saying multiplying 3 from b8 value
        int b10 = 6;
        float b11 = b10 /= 3;// " /= " means dividing 6 to 3, simply saying dividing b10 value from 3



        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b6);
        System.out.println(b8);
        System.out.println(b9);
        System.out.println(b10);
        System.out.println(b11);

        //comparison operators
        System.out.println(6 == 6);
        System.out.println(6 > 7);
        System.out.println(2 < 6);
        System.out.println(1 <= 2);
        System.out.println(4 >= 2);

        //logical operators
        System.out.println(5 > 3 && 5 >7);//it will print true when both conditions are satisfied as true
        System.out.println(5 > 9 || 5 > 3);// it will print true even if one condition is satisfied as true



    }



}
