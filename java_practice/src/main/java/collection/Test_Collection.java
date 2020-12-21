package collection;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author boqingbaba
 * @create 2020-12-18-19:30
 */
public class Test_Collection {

    public static void main(String[] args) {

        String  [] arr = {"11","22"};

        Collection<String> c = new ArrayList<String>();
        c.add("aa");
        c.add("bb");
        c.add("cc");
        System.out.println(c);

        System.out.println(c.isEmpty());
        System.out.println(c.size());


        Collection<String> c1 = new ArrayList<String>();
        c1.add("dd");
        c1.add("ee");
        c1.addAll(c);
        System.out.println(c1);

        c1.remove("dd");
        System.out.println(c1);


        System.out.println(c1.contains("aa"));
        System.out.println(c1.contains("ff"));

        Object[] objs ;
        objs = c.toArray(new Object[0]);
        objs = c.toArray(new Object[5]);

        System.out.println(Arrays.toString(objs));

//        保留类型

        String [] strs = c.toArray(new String [0] );

        System.out.println(Arrays.toString(strs));


        c.clear();
        System.out.println(c.size());
        System.out.println(c.isEmpty());









    }



}
