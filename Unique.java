package com.company;


public class Unique {

    public static void main(String[] args) {

        String str = new String("Ashhud");
        String uni = new String("Unique");

        System.out.println("Does the String \"" + str + "\" have unique characters?: " + uniqueString(str));
        System.out.println("Does the String \"" + uni + "\" have unique characters?: " + uniqueString(uni));
    }

    public static boolean uniqueString(String str) {

        //compares each character in the string with one another
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                //returns false if it finds a match
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
