package innerclass_practice;

/**
 * @author boqingbaba
 * @create 2020-12-18-14:21
 */

class Outer2 {
    int x = 11;

    class Inner2 {
        int x = 22;

        public void f() {
            int x = 33;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer2.this.x);
        }
    }
}

public class Demo01 {

    public static void main(String[] args) {

        Outer2.Inner2 ini = new Outer2().new Inner2();
        ini.f();
    }
}
