package thuchanhstatic;

public class Teststaticmethod {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(111, "Hán Tới");
        Student student2 = new Student(112, "Hồi Thu");
        Student student3 = new Student(113, "Tình Chu");

       student1.display();
       student2.display();
       student3.display();
    }

}
