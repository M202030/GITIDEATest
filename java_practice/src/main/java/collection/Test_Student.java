package collection;

import com.sun.deploy.panel.ITreeNode;
import com.sun.scenario.effect.impl.prism.ps.PPSBlend_MULTIPLYPeer;

import java.time.chrono.IsoEra;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * @author boqingbaba
 * @create 2020-12-20-14:29
 */



class Student{

    private int no;
    private String name;

    public Student(int no ,String name){
        super();
        this.no= no ;
        this.name= name;
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

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}



public class Test_Student {

    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(11,"郭靖"));
        set.add(new Student(22,"黄蓉"));
        set.add(new Student(33,"杨康"));
        set.add(new Student(11,"小黄"));

        /*Iterator<Student> ir = set.iterator();
        while (ir.hasNext()){
            System.out.println(ir.next());
        }*/

//        for (Student student : set) {
//            System.out.println(student);
//        }

        set.forEach(System.out::println);





    }


}
