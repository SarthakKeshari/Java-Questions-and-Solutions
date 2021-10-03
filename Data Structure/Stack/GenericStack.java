/*
Statement: Implement a Generic Stack class in Java
 */

import java.util.ArrayList;

class Stack<T> {
    private final ArrayList<T> stack;
    private final int size;
    private int top;

    //initialize stack and its fields
    public Stack(int size) {
        this.size = size;
        this.top = -1;
        stack = new ArrayList<>(size);
    }

    //Returns top value in stack
    public T top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }

        return stack.get(top);
    }

    //Removes top value in stack and returns the popped value
    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        }

        T popped = stack.get(top);
        //set value to null
        stack.set(top, null);
        top--;
        return popped;
    }

    //Push value in stack
    public void push(T val) {
        //check if stack is full
        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;
        }

        //push new value in stack
        stack.add(val);
        top++;
    }

    //checks if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    //get stack size
    public int size() {
        return this.size;
    }

    //print stack data and meta-data
    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + stack +
                ", size=" + size +
                ", top=" + top +
                '}';
    }
}

public class GenericStack {
    public static void main(String[] args) {
        //stack of integers of size 10
        Stack<Integer> integerStack = new Stack<>(10);

        //fill the stack completely
        for (int i = 0; i < integerStack.size(); i++) {
            integerStack.push(i);
        }

        //print stack information
        System.out.println(integerStack);

        //print top value in stack
        System.out.println(integerStack.top());

        //stack is full
        integerStack.push(100);

        //pop all elements in stack
        for (int i = 0; i < integerStack.size(); i++) {
            integerStack.pop();
        }

        //print stack information
        System.out.println(integerStack);

        //stack underflow
        integerStack.pop();

        //stack of String of size 5
        Stack<String>stringStack = new Stack<>(5);

        stringStack.push("Hello");
        stringStack.push("Java");
        stringStack.push("Programmers");

        //get top value in stack
        System.out.println(stringStack.top());

        //pop the stack and get popped value
        String poppedValue = stringStack.pop();

        //print popped value
        System.out.println(poppedValue);

        //print stack information
        System.out.println(stringStack.toString());
    }
}
