package thuchanhstatic;

public class Student {
    private int id;
    private String name;
    private static String college = "BBDIT";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

   void display() {
       System.out.println(id + " " + name + " " + college);
   }
}
