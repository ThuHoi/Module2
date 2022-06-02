package thuchanh.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Main {
        public static void main(String[] args) {
            Student student1 = new Student("Hoi", 18, "HP");
            Student student2 = new Student("Tinh", 20, "ND");
            Student student3 = new Student("Toi", 21, "VP");

            System.out.println("...........Map");
            Map<Integer, Student> hashMap = new HashMap<>();
            hashMap.put(1, student1);
            hashMap.put(2, student2);
            hashMap.put(3, student3);


            Map<Integer, Student> treeMap = new TreeMap<>(hashMap);
            System.out.println("Display entries in ascending order of key");
            System.out.println(treeMap);

            Map<Integer, Student> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(18, student1);
            linkedHashMap.put(20, student2);
            linkedHashMap.put(21, student3);

            System.out.println("The age for " + "Hoi is " + linkedHashMap.get(18).getAge());


        }


    }
}
