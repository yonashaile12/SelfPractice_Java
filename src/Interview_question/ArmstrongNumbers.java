package Interview_question;

import java.util.Arrays;

public class ArmstrongNumbers {

    public  static  boolean ArmStrongNumber (int  num) {

        int a = 0,    b =0,    c= num;

        while(num>0){

            a=num%10;

            num/=10;

            b=b+(a*a*a);

        }



        if(c==b) {

            return true;

        }

        return false;

    }

    public static boolean isArmstrong(int num){
        String value = String.valueOf(num);
        // String value1 = num+"";
        int power = value.length();
        int sum = 0;

        for(int i = 0; i< value.length(); i++){
            int digit = Integer.parseInt(""+value.charAt(i));
            sum += Math.pow(digit, power); // number raised to power == 1 ^3

        }
        return num == sum;
    }


}
