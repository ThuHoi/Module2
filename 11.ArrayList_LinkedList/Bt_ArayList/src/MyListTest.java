import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(0, 5);
        list.add(0, 6);
        list.add(0, 7);
        list.add(0, 7);
        list.add(0, 7);
        list.add(2, 100);

        System.out.println(list.remove(2));
        System.out.println(list.remove(2));
        System.out.println("------------");
        list.display();

        System.out.println(list.size());
        System.out.println("------------------");
        System.out.println("Clone:");
        System.out.println(Arrays.toString(list.clone()));
        System.out.println("------------------");
        System.out.println("Contains:");
        System.out.println(list.contains(3));
        System.out.println("------------------");
        System.out.println("indexOf:");
        System.out.println(list.indexOf(8));
        System.out.println("------------------");
        System.out.println("Boolean add:");
        System.out.println(list.add(4));
        System.out.println("------------------");
        System.out.println("Get elements[i]:");
        System.out.println(list.get(2));
        System.out.println("------------------");
        System.out.println("Clear:");


    }


}
