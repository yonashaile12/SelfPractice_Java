package Interview_question;

public class ReverseStr {

    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];

        return  reverse;

    }

    public  static String  Reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }

}
