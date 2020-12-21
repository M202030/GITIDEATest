package collection;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author boqingbaba
 * @create 2020-12-20-16:06
 */
public class Demo_queue {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();
        q.add("aa");
        q.offer("bb");
        q.offer("cc");
        System.out.println(q);

        System.out.println(q.element());

        System.out.println(q.peek());

//        System.out.println(q.size());










    }


}
