package Interview_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySortDec {

    public static void SortingArrayListDesc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> intArray = Arrays.asList(4,5,2,1,7,9,3);
        SortingArrayListDesc(intArray);
    }
}

