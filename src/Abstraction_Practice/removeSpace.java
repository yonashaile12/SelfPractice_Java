package Abstraction_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class removeSpace {


    public static void main(String[] args) {

        String str = " Hello  World Java  ";
        System.out.println(removeSpace(str));

       // System.out.println(remove(str));

        System.out.println(removeWhiteSpace(str));


    }

    public static String removeSpace(String str){
        char[] chr = str.toCharArray();
        String withOutSpace = "";

        for(int i = 0; i < chr.length; i++){
            if(chr[i] != ' '){
            withOutSpace += chr[i];
            }
        }


        return withOutSpace;


    }

    public static String remove(String str){
        String str1 = "";
        char[] charArr = str.toCharArray();
        char prevChar = ' ';
        for(int i = 0; i < charArr.length; i++){
            char currentChar = charArr[i];

            if(!(prevChar == ' ' && currentChar == prevChar)){
                str1 += currentChar;
            }
             prevChar = currentChar;
        }


        return str1;

    }

    //String[] splitted = input.trim().split("\\s*,\\s*");

    public static String removeWhiteSpace(String str){
        String result = "";

        String[] splitted = str.trim().split("");

        for(String each: splitted){
                result += each;
        }

        return result;
    }
}
