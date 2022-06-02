package Bt_Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> stack;

    public MyStack() {

        stack = new LinkedList<>();
    }

    public void push(T e) {
        stack.addFirst(e);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }


    public int size() {

        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}