package Interview_question;

public class passwordValidation {

    public static boolean PassWordvalidation(String password) {

        String lowercase="(.*[a-z].*)";

        String uppercase="(.*[A-Z].*)";

        String numbers="(.*[0-9].*)";

        String specialchars="(.*[ -/, :-@].*)";



        boolean  HasLower = password.matches(lowercase),

                HasUppere = password.matches(uppercase),

                HasDigits = password.matches(numbers),

                HasSpecial = password.matches(specialchars),

                Valid = false;



        if(password.length() >= 6 && !password.contains(" "))

            if( HasLower && HasUppere && HasDigits && HasSpecial)

                Valid = true;

        return Valid;

    }
}
