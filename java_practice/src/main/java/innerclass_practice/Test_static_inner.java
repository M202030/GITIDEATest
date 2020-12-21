package innerclass_practice;

/**
 * @author boqingbaba
 * @create 2020-12-18-14:38
 */


class Souter {
    private int x = 11;
    private static int sx = 22;


    static class Sinner {
        private int y = 33;
        static int sy = 44;

        public void func() {
            System.out.println(y + sy);
            System.out.println(new Souter().x + sx);

        }

        public static void sfunc() {
            System.out.println(sy + new Sinner().y);
            System.out.println(sx + new Souter().x);

        }

    }

    public void method() {

        Sinner inner = new Sinner();
        inner.func();

        Sinner.sfunc();
    }

}

public class Test_static_inner {

    public static void main(String[] args) {
        Souter.Sinner sinner = new Souter.Sinner();
        sinner.func();
        Souter.Sinner.sfunc();
        Souter souter = new Souter();

    }

}
