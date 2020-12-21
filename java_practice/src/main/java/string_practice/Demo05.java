package string_practice;


import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author boqingbaba
 * @create 2020-12-17-20:57
 */
public class Demo05 {

    public static void main(String[] args) {

       /* Integer i;

        i =23;

        int i1 = i.compareTo(43);
        System.out.println(i1);*/

//        int n = 3434;
//        Integer i = new Integer(n);
//
//        i = Integer.valueOf(n);
//
//        i = n;
//        System.out.println(i);
//
//
//        n = i.intValue();
//
//        n = i;
//        System.out.println(n);

//        int num = 673;
//
//        Integer ii = new Integer(num);
//        String s1 = ii.toString();
//
//        StringBuffer sbf = new StringBuffer(s1);
//        String s2 = sbf.reverse().toString();
//        System.out.println(s2);
//
//        int i = Integer.parseInt(s2);
//        System.out.println(i);
//        System.out.println(System.currentTimeMillis());
//
//        java.util.Date  date = new java.util.Date();
//        System.out.println(date);
//
//        long time = date.getTime();
//        System.out.println(time);

/*//      1. 使用java.util.Date 获取当前时间戳
        java.util.Date date = new java.util.Date();
//      2.  使用java.sql.Date 创建date对象。并传入构造参数 date.gettime()
        Date dt  =new Date(date.getTime());

        System.out.println(dt);

//      3 日期类型转字符串类型
        String s = dt.toString();

        System.out.println(s);
//      4 字符串转日期类型  一般想转什么类型就用 类型.valueOf()
        dt = Date.valueOf(s);
        System.out.println(dt);*/

       /* DecimalFormat f = new DecimalFormat("00.00");
        System.out.println(f.format(4.5));

        f= new DecimalFormat("##.##");
        System.out.println(f.format(4.5));*/


        java.util.Date date = new java.util.Date();

        SimpleDateFormat df   = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

        System.out.println(date.getTime());
        System.out.println(df.format(date));


        df = new SimpleDateFormat("yyyy年MM月dd日 HH小时mm分ss秒SSS毫秒");
        System.out.println(df.format(date));

        Calendar c  =Calendar.getInstance();
        System.out.println(c.getTime());

        c.set(2030,5,5);
        System.out.println(c.getTime());

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));


















    }


}
