package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author boqingbaba
 * @create 2020-12-20-10:33
 */
public class Iterator_list {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        System.out.println(list);

//      1 增强for循环
      /*  for (String s : list) {
            System.out.println(s);
        }*/
//      2foreach
//        list.forEach(System.out::println);
//      3 iterator
//        Iterator<String> ir = list.iterator();
//        System.out.println(ir.next());
//        System.out.println(ir.next());
//        System.out.println(ir.next());

       /* while (ir.hasNext()){
            System.out.println(ir.next());
        }*/

//        4. 普通for循环

        for (int i = 0; i< list.size();i++){
            System.out.println(list.get(i));
        }

//        5 ListIterator

        ListIterator<String> sli = list.listIterator();
//        向后遍历
        System.out.println("-------------------");
        while (sli.hasNext()){
            System.out.println(sli.next());
            sli.add("hello");
        }

        System.out.println("&&&&&&&&&&&&&");
        System.out.println(list);

//        向前遍历
        while (sli.hasPrevious()){

            System.out.println(sli.previous());
        }

        System.out.println("##################");

        sli=list.listIterator();
        System.out.println(list);

        System.out.println(sli.next());
        sli.remove();
        System.out.println(list);



    }


}
