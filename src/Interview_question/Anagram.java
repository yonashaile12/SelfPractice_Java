package Interview_question;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String one, String two){

        if(one.length() != two.length()) return false;
        one = one.toLowerCase();
        two = two.toLowerCase();

        int[] counter = new int[26];
        // a --> 0
        // b --> 1
        // z --> 25

        for(int i = 0; i< one.length();i++){

            char oneLetter = one.charAt(i);
            char twoLetter = two.charAt(i);

            //apple
            //counter[0] = counter[0] + 1;
            // a --> 97 ascii
            counter[oneLetter -97] = counter[oneLetter - 97]+ 1;
            counter[twoLetter-97] =  counter[twoLetter -97] -1;

        }
        return Arrays.equals(counter, new int[26]);

    }
}
