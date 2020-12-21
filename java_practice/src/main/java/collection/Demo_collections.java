package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author boqingbaba
 * @create 2020-12-20-16:29
 */
public class Demo_collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        Collections.addAll(list,"cc","bb");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(list);

        System.out.println(Collections.binarySearch(list,"cc"));

        System.out.println(Collections.binarySearch(list,"ff"));


        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


        System.out.println(Collections.frequency(list,"aa"));


        Collections.addAll(list,"cc","cc");
        System.out.println(Collections.frequency(list,"cc"));


        System.out.println(Collections.frequency(list,"ccc"));

        Collections.fill(list,"hello");
        System.out.println(list);





    }


}
