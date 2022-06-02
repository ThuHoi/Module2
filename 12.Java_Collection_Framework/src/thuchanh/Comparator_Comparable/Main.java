package thuchanh.Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hoi", 18, "HP");
        Student student2 = new Student("Tinh", 22, "ND");
        Student student3 = new Student("Huy", 20, "VP");

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student e : list) {
            System.out.println(e);
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("Compare by age: ");
        for (Student st : list) {
            System.out.println(st.toString());
        }


    }
}
