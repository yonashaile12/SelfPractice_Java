package Interview_question;

public class SortLetters {

    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }
}
