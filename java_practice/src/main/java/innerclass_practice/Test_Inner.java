package innerclass_practice;

/**
 * @author boqingbaba
 * @create 2020-12-18-13:41
 */


class Outer {

    private int x = 11;
    static  int z = 33;


    class Inner {
        private int y = 22;

        static final int N_VALUE =55;

        public void fun() {
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);

        }
    }

    public void methods() {
        Inner inner = new Inner();
        inner.fun();
    }
}


public class Test_Inner {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = new Outer().new Inner();
        inner.fun();
    }


}
