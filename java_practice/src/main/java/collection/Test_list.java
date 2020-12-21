package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author boqingbaba
 * @create 2020-12-18-21:08
 */
public class Test_list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        System.out.println(list);

        list.add(1, "hello");
        System.out.println(list);

        System.out.println(list.get(3));

        list.set(1, "tom");
        System.out.println(list);

//        System.out.println(list.subList(0,2));


        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(list);
// 默认按照自然升序排序   指定sort参数为空对象，没有指定比较器
        list.sort(null);
        System.out.println(list);


    }


}
