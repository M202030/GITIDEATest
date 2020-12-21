package string_practice;

import java.util.Arrays;

/**
 * @author boqingbaba
 * @create 2020-12-17-8:55
 */
public class Demo2 {
    public static void main(String[] args) {

        String s = "hello";

//        1 字符串拼接
        s = s.concat("tom");
        System.out.println(s);

//        2 求字符串长度
        int le = s.length();
        System.out.println(le);

//        3 比较字符串是否相等，区分大小写
        String s1 = "hello";
        /*System.out.println(s.equals(s1));
        System.out.println("Hello".equals(s1));
        System.out.println("hello".equals(s1));*/

//        4 忽略大小写的比较

        String s2 = "HeLLo";
        System.out.println(s2.equalsIgnoreCase(s1));

//      5 转大写

        String s3 = s1.toUpperCase();
        System.out.println(s3);
//        6 转小写
        String s4 = s3.toLowerCase();
        System.out.println(s4);

//        7 参数串在当前串 第一次出现的位置索引
        int ll = s4.indexOf("ll");
        System.out.println(ll);
        int df = s4.indexOf("df");
        System.out.println(df);

//        8 参数串在当前串 最后一次出现的位置索引
        int lo = s4.lastIndexOf("lo");
        System.out.println(lo);
//        9 获取指定位置的字符
        char c = s4.charAt(0);
        System.out.println(c);
        char c1 = s4.charAt(3);
        System.out.println(c1);
//        10 取子串
        String ss = s4.substring(2);
        System.out.println(ss);
//          从起始位置到终止位置的前一位
        String ss1 = s4.substring(1, 3);
        System.out.println(ss1);

//     11 去掉字符串的首位空格
        String s5 = " H  el  l o  ";
        System.out.println(s5.trim());
//      12 替换 用第二个参数 替换 第一个参数出现的字符
        System.out.println("hello你好tom".replace("你好","hello"));

//        替换  使用 空串替换字符串中的所有空格
        String re = s5.replace(" ", "");
        System.out.println(re);
//      13  是否以指定的参数串结尾
        String s6 = "hisense.java";
        boolean ja = s6.endsWith("java");
        System.out.println(ja);

        boolean his = s6.startsWith("his");
        System.out.println(his);

//        14 比较字符串大小
       /* System.out.println("ab".compareTo("ab"));
        System.out.println("abc".compareTo("ab"));
        System.out.println("bc".compareTo("ab"));
        System.out.println("ab".compareTo("cd"));*/

//        15 字符串转成 char[]
        String str= "hello";
        char[] crs = str.toCharArray();
        System.out.println(Arrays.toString(crs));
//        16 按照参数串 分割 成 字符串 数组  string[]
        String str1 = "aa bb cc dd ee";
        String[] sp = str1.split(" ");
        System.out.println(Arrays.toString(sp));
//      17 参数串在当前字符串中是否包含
        System.out.println("hello".contains("ll"));
        System.out.println("hello".contains("xys"));

//        StringBuffer



    }


}
