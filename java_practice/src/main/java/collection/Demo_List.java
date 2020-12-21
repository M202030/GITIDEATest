package collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author boqingbaba
 * @create 2020-12-20-11:24
 */
public class Demo_List {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("dd");
        System.out.println(list);
        System.out.println(list.size());

        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("aa");
        linkedList.add("bb");
        linkedList.add("cc");
        linkedList.addFirst("hello");
        System.out.println(linkedList);





    }


}
