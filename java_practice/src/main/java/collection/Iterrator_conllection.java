package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author boqingbaba
 * @create 2020-12-20-9:52
 */
public class Iterrator_conllection {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();
        c.add("aa");
        c.add("bb");
        c.add("cc");
        System.out.println("集合是："+c);

//         1 增强for循环
       /* for (String s : c) {
            System.out.println(s);
        }*/
//      2 集合的foreach()
//        c.forEach(System.out::println);

//        3 迭代器
        Iterator<String> ir = c.iterator();
//        ir.forEachRemaining(System.out::println);


//        System.out.println();
        ir=c.iterator();
//        System.out.println(ir.next());
//        System.out.println(ir.next());
//        System.out.println(ir.next());
//        System.out.println(ir.next());
        while (ir.hasNext()){
            System.out.println(ir.next());
            ir.remove();
        }


        System.out.println("##############");
//        ir=c.iterator();
//        System.out.println(ir.next());












    }
}
