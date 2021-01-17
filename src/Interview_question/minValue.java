package Interview_question;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class minValue {

    public  static  int  minValue( Map<String,Integer> map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first( );

    }
}
