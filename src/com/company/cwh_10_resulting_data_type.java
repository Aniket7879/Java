package com.company;

public class cwh_10_resulting_data_type {

    public static void main(String[] args) {

        /*
        Result = byte + short -> integer
        Result = short + integer -> integer
        Result = long + float -> float
                Result = integer + float -> float
                Result = character + integer -> integer
        Result = character + short -> integer
        Result = long + double -> double
        Result = float + double -> double
        */

         /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b); */

        // Increment and Decrement operators
        int i = 56;
        System.out.println(i++); // here in this case i will print first and then it will increment
        // if you observe carefully the syntax is in i++ is i written first and then ++ both are Seperate
        // so in the below line printing after incrementing
        System.out.println(i);
        // here in this case first incrementing and then it will print i
        System.out.println(++i);
        System.out.println(i);//printing i value

        int b = i++;// here 56 value will go to i first and will go to b first and then increment it
        int j = 67;
        int c = ++j;// here 56 value will increment first then go to j then will go to c

        int y = 7;
        int x = ++y * 8;// highest precedency ++ then *
        // x = 8 * 8
        // x = 64
        System.out.println(x);

        char e = 'a';
        System.out.println(++e);// here first it incremented the character a to b then printed e

    }


}
