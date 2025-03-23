package com.company;

public class CWH_14_string_methods {

    public static void main(String[] args) {

        String name = "Aniket";
        int value = name.length();// .length will give us the length of the string
        System.out.println(value);
        String lString = name.toLowerCase();// .toLowerCase converts all the strings characters into lowercase
        System.out.println(lString);
        String uString = name.toUpperCase();// .toUpperCase converts all the strings characters into uppercase
        System.out.println(uString);
        String nonTrimmedString = "     Aniket     ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(name.substring(2));// it will print from the index we provided
        System.out.println(name.substring(1,5));// Aniket contains 5 index starting with 0 so it will print till 4th
        // index it will not print the end index we are giving if you want to print end index also add +1 and then
        // print it for rg instead of end index 5 give 6 as shown in the below line
        System.out.println(name.substring(1,6));// if end index is not existing also it will print and will not
        // give any error
        System.out.println(name.replace('e', 'a'));// it will replace the characters from the string
        System.out.println(name.replace("Aniket","tekinA"));// it will replace the target elements
        System.out.println(name.replace("A", "Hello"));// can also replace one character to more
        System.out.println(name.startsWith("Ani"));// it will return aas boolean true or false
        System.out.println(name.startsWith("inA"));
        System.out.println(name.endsWith("ket"));
        System.out.println(name.endsWith("tek"));
        System.out.println(name.charAt(2));// gives character at the given index
        String name2 = "Harry";
        System.out.println(name2.indexOf("rr"));// it will return the first closest index found in the string sequence
        String name3 = "Harryrry";
        System.out.println(name3.indexOf("rry",4));// it will start finding out from the 4th index
        //which one is closest and give it to us
        System.out.println(name3.indexOf("rry34342"));// it will return -1 if it didn't find the reference
        // it founded rry but it didn't find 34342
        System.out.println(name3.lastIndexOf("rry"));// it will return the last index while indexof returns
        // starting index
        // indexof starts searching from starting and lastindex of search from ending
        System.out.println(name3.lastIndexOf("rry", 4));// from 4th index it started searching from
        // 4 then 3 , 2, 1, 0 like that
        // indexof searches 1, 2, 3,4, like that
        System.out.println(name.equals("Aniket"));// checks the string is equal or not
        System.out.println(name.equals("arwe"));
        System.out.println(name.equalsIgnoreCase("aniket"));// ignores upper and lower cases
        System.out.println(name.equalsIgnoreCase("aniketsda"));

        // Escape Sequece characters
        // \\ - BackSlash
        // \' - Single Quote
        // \t - tab
        // \n - new line

//      \t	Insert a tab in the text at this point.
//      \b	Insert a backspace in the text at this point.
//      \n	Insert a newline in the text at this point.
//      \r	Insert a carriage return in the text at this point.
//      \f	Insert a form feed in the text at this point.
//      \'	Insert a single quote character in the text at this point.
//      \"	Insert a double quote character in the text at this point.
//      \\	Insert a backslash character in the text at this point.

        System.out.println("I am the Escape Character \\ double quote ");
        System.out.println("I am the Escape Character \' double quote ");
        System.out.println("I am the Escape Character \n double quote ");
        System.out.println("I am the Escape Character \t double quote ");
    }


}
