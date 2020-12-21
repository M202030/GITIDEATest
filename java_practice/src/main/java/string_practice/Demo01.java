package string_practice;


import java.util.Scanner;

/**
 * @author boqingbaba
 * @create 2020-12-16-11:36
 */


class Person {
    private int age;
    private String name;
    private int num;
    private String sex;


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void run(){

    }

}


public class Demo01 {

    public static final Double PI_VALUE = 3.14444;


    public static void main(String[] args) {


        System.out.println("hello");

        String s = new String("hello");
        int acc = s.compareTo("avc");
        System.out.println(acc);
        System.out.println();
        Person person = new Person();
        person.run();




//        Scanner input = new Scanner(System.in);


    }

}
