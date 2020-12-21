package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author boqingbaba
 * @create 2020-12-20-14:49
 */
public class Demo_set {

    public static void main(String[] args) {
        /*HashSet<String> set = new HashSet<>();
//        set.add("aa");
//        set.add("bb");
//        set.add("cc");
//        set.add("ab");
        System.out.println(set.size());*/

      /*  Set<String> set2 = new LinkedHashSet<>();
        set2.add("hello");
        set2.add("aa");
        set2.add("bb");
        System.out.println(set2);

        for (String s : set2) {
            System.out.println(s);
        }*/

        Set<String> set3 = new TreeSet<>();
        set3.add("aa");
        set3.add("bb");
        set3.add("cc");
        System.out.println(set3);


        Set<String> set4 = new TreeSet<>((s1, s2) -> s2.compareTo(s1));
        set4.add("dd");
        set4.add("aa");
        set4.add("cc");
        set4.add("dd");
        set4.add("gg");
        System.out.println(set4);


    }
}
