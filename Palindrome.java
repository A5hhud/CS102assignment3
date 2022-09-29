package com.company;

import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {

        String str = new String("Ashhud");
        String pal = new String("taco cat");

        System.out.println("Is \"" + str + "\" an palindrome?: " + otherWay(str));
        System.out.println("Is \"" + pal + "\" an palindrome?: " + otherWay(pal));
    }

    public static boolean otherWay(String str) {

        //makes it not case-sensitive
        str = str.toLowerCase(Locale.ROOT);
        //gets rid of any spaces in the string
        str = str.replaceAll("\\s", "");

        //reverses string
        String reverse = new String("");
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        //compares string with reverse string
        if (str.equals(reverse)) {
            return true;
        }
        return false;
    }
}
