package string_practice;

/**
 * @author boqingbaba
 * @create 2020-12-17-20:27
 */
public class Demo04 {
    public static void main(String[] args) {

        StringBuffer sf = new StringBuffer();
        sf.append("hello");
        sf.append("tom");
        System.out.println(sf.toString());

        sf.insert(5,"你好");
        System.out.println(sf.toString());
        sf.setCharAt(5,'您');
        System.out.println(sf.toString());

        sf.delete(5,7);
        System.out.println(sf.toString());

        sf.reverse();
        System.out.println(sf);

        sf.deleteCharAt(5);
        System.out.println(sf);









    }

}
