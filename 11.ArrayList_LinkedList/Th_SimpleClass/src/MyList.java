import java.util.Arrays;

public class MyList<E> {
  private int size = 0;
  private static final int DEFAULT_CAPACITY = 10;
  private Object elements[];

  public MyList() {
      elements = new Object[DEFAULT_CAPACITY];
  }



    private void ensureCapa() {
      int newSize = elements.length * 2;
      //elements = Arrays.copyOf(elements,newSize);
        Object[] objects = new Object[newSize];
        for (int i = 0; i < elements.length; i++) {
                objects[i] = elements[i];
            }
            elements = objects;
        }


    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
        }
        return (E) elements[i];
    }





}
