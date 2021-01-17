package Interview_question;

import java.util.*;

public class RemoveNameFromArray {

    public static void removeNameList(){
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        for(ListIterator<String> it = names.listIterator(); it.hasNext();)

            if(it.next().equals("Ahmed"))

                it.remove();



        System.out.println(names);
    }

    public static void removeName(){
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {

            if(it.next().equals("Ahmed"))

                it.remove();

        }

        System.out.println( names );
    }

    public static void removingNameFromList(){

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

                names.removeAll( Arrays.asList("Ahmed"));



        System.out.println(names);
    }
}
