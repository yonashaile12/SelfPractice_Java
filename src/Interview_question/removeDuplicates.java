package Interview_question;

public class removeDuplicates {

    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);



        return result;

    }
}
