package com.company;

public class CWH_CH3_15_PS3 {

    public static void main(String[] args) {


        //Chapter 3 Video 15 Practice set 3

        // Question 1 : Convert a string to lower case
        String name = "Aniket";
        name = name.toLowerCase();
        System.out.println(name);

        //Question 2 : Replace spaces with underscore
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        //Question 3 : Replace name in the String
        String letter = "Dear <|name|>, Thanks a Lot";
        letter = letter.replace("<|name|>", "Aniket");
        System.out.println(letter);

        //Question 4 : Java Program to detect double and triple spaces in a string
        String myString = "This String Contains Dobule     and Triple spaces";
        int myString1 = myString.indexOf("  ");
        int myString2 = myString.indexOf("   ");
        System.out.println(myString1);
        System.out.println(myString2);

        //Question 5 : Make the string as a letter
        String myLetter = "Dear Aniket, \n\tThis Java Course is Nice. \nThanks!!!";
        System.out.println(myLetter);

    }


}
