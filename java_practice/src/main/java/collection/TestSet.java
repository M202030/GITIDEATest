package collection;

import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author boqingbaba
 * @create 2020-12-20-15:31
 */

class Employee implements Comparable<Employee>{
    private int no;
    private String name;
    private int age;
    public  Employee(int no, String name,int age){
        super();
        this.no=no;
        this.name=name;
        this.age=age;

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int n = this.age-o.age;
        if(n == 0){
            return this.name.compareTo(o.name);
        }

        return n;
    }
}



public class TestSet {

    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>();
        Employee guojing = new Employee(11,"郭靖",15);
        Employee huangrong = new Employee(14,"黄蓉",15);
        Employee yangkang = new Employee(11,"杨康",23);
        Employee guoxiang = new Employee(11,"郭襄",3);

        set.add(guojing);
        set.add(huangrong);
        set.add(huangrong);
        set.add(yangkang);
        set.add(guoxiang);

        set.forEach(System.out::println);

    }

}
