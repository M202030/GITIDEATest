package collection;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author boqingbaba
 * @create 2020-12-20-17:32
 */
public class Demo_map_iter {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("PBC", "农业银行");
        map.put("BC", "中国银行");
        map.put("ICBC", "工商银行");
        System.out.println(map);


//        遍历方法1
//        map.keySet().forEach(System.out::println);
//        map.values().forEach(System.out::println);


//      遍历方法2
       /* map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+","+s2);
            }
        });*/

//         迭代器
        Set<Map.Entry<String, String>> entries = map.entrySet();

       /* entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                System.out.println(stringStringEntry.getKey()+"="+stringStringEntry.getValue());
            }
        });*/

        entries.iterator().forEachRemaining(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                System.out.println(stringStringEntry.getKey() + "=" + stringStringEntry.getValue());
            }
        });


        Map<String, String> map1 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        map1.put("11", "aa");
        map1.put("33", "cc");
        map1.put("22", "bb");

        System.out.println(map1);



    }

}
