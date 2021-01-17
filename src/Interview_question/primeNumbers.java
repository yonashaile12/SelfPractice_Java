package Interview_question;

public class primeNumbers {

    public static boolean primeNumber(int num) {
        if(num < 2) return false;

        for(int i = 2; i < num; i++) {

            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean isPrimeNumber(int num){

        if(num < 0) return false;

        for(int i = 2; i < num/2; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    // print out all prime numbers up to a number

    public static void printPrimeNumber(int number){
        for(int i = 1; i < number; i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }
}
