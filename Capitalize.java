package com.company;

public class Capitalize {

    public static void main(String[] args) {

        String str = "hello everyone. let's write some useful Java code today. we will begin with strings.";
        System.out.println(proper(str));
    }

    public static String proper(String str) {

        String cap = "";
        //splits string where it encounters a period followed by a space
        String[] strArr = str.split("\\. ",0);

        for (int i = 0; i < strArr.length; i++) {
            //gets rid of period for very last sentence
            strArr[i] = strArr[i].replaceAll("\\.", "");
            //capitalizes first character of each element in the array
            strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
            //adds element back into string followed by punctuation
            cap = cap.concat(strArr[i]);
            cap += ". ";
        }
        return cap;
    }
}
