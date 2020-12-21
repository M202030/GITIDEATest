package string_practice;

/**
 * @author boqingbaba
 * @create 2020-12-17-16:51
 */
public class Demo03 {

    public static void main(String[] args) {
       StringBuffer sf= new StringBuffer();
        /* System.out.println(sf.capacity());

        sf = new StringBuffer("hello");
        System.out.println(sf.capacity());

        sf = new StringBuffer(100);
        System.out.println(sf.capacity());*/

        sf = new StringBuffer("hello");
        System.out.println(sf.capacity());

        sf.trimToSize();
        System.out.println(sf.capacity());

        sf.append("hello");
        System.out.println(sf.capacity());


        sf = new StringBuffer();
        System.out.println(sf.capacity());











    }


}
