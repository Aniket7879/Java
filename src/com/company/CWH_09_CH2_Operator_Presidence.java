package com.company;

public class CWH_09_CH2_Operator_Presidence {

    public static void main(String[] args) {
        //Precedence means which operator is bigger will evaluate/run/execute first
        //Precedence Example * Precedence is greater than + Precedence so * will evaluate first than + will evaluate

        int a = 6*5 - 34/2;// here both precedence is same for * and /
        // so check associativity, It will work as left to right
        // * and / associativity is left to right
        /*
        = 30 - 34/2
        = 30 - 27
        = 13
         */
        System.out.println(a);
        int b = 60/5 - 34*2; // here in this case * and / precedence is same so will check in this situation
                             // associativity for * and / associativity is left to right
        // = 12 - 34*2
        // = 12 - 68
        // = -56
        System.out.println(b);

        //a = b = 45; // both = equals to has same precedence,Then we check associativity it will work as
                    // right to left so first 45 will go inside b and inside a

        // Quick quiz
        // ( x - y ) / 2
        int x = 6;
        int y = 2;
        int k = x * y/2; // precedence same associativity left to right
        System.out.println(k);

        // ( b square - 4ac ) / 2a
        // ( e square - 4df ) / 2d
        int e = 4;
        int d = 2;
        int f = 3;
        int k1 = e*e - (4*d*f) / (2*d); // here () parenthesis precedence is more than * and -
        // highest precedence here () then * then - and associativity is left to right
        // = 4*4 - ( 4*2*3 ) / ( 2 *2 )
        // = 4*4 - ( 24 ) / ( 2*2 )
        // = 4*4 - ( 24 ) / ( 4 )
        // = 4*4 - 6
        // = 16 - 6
        // = 10
        System.out.println(k1);

        // g square - h square
        int g = 2;
        int h = 3;
        int k2 = g*g - h*h; // precedence same associativity left to right
        // = 2*2 - 3*3
        // = 4 - 3*3
        // = 4 - 9
        // = -5
        System.out.println(k2);

        // i * j - l
        int i = 2;
        int j = 3;
        int l = 4;
        int k3 = i * j - l;// highest precedence * then - and associativity left to right
        // = 2 * 3 - 4
        // = 6 - 4
        // = 2
        System.out.println(k3);








        //Associativity means which operator will execute left to right / right to left


    }

}
