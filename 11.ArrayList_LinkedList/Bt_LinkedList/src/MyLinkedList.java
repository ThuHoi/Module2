import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private int size;
    private Node head;


    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        head = new Node(data);
    }

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }


    //Thêm phần tử vào vị trí
    public void add(int index, E e) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < (index - 1) && (temp.next != null); i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        size++;
    }


    //Thêm phần tử mới vào đầu danh sách
    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        size++;
    }

    //Thêm phần tử mới vào cuối danh sách
    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        size++;
    }

    //Xóa 1 phần tử tại vị trí index
    public E remove(int index) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        size--;
        return (E) holder;
    }

    //xóa 1 phần tử cho trước
    public boolean remove1(E e) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            temp = temp.next;
            if (temp.data == e) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return getSize();
    }

    //thực hiện sao chép danh sách ra 1 danh sách khác
    public E clone() {
        Node temp = head;
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(new Node(temp.data));
        temp = temp.next;
        while (temp.next != null) {
            myLinkedList.addLast(new Node(temp.data));
            temp = temp.next;
        }
        return (E) myLinkedList;

    }

    //kiểm tra phần tử o có trong danh sách không
    public boolean contains(E e) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == e)
                return true;
        }
        return false;
    }

    //trả về vị trí của phần tử o trong danh sách
    public int indexOf(E e) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == e)
                return i;
        }
        return -1;
    }

    public boolean add(E e) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            temp = temp.next;
        }
        temp = new Node(e);
        return true;
    }

    public void ensureCapicity(int minCapicity) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = head;
        Node temp = head;
        Node temp1 = myLinkedList.head;
        for (int i = 0; i < minCapicity - 1; i++) {
            temp1.next = temp.next;
        }
    }

    public E get(int i) {
        Node temp = head;
        for (int j = 0; j < i - 1; j++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = null;
    }
}
