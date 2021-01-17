package Interview_question;

public class getTheSecondMaxNum {

    public static int getSecondMaxNumber(int ... arr){

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int eachNum : arr){
            if(eachNum > max ){
                second = max;
                max = eachNum;
            }

            if(eachNum > second && eachNum < max){
                second = eachNum;
            }
        }

        return second;
    }
}
