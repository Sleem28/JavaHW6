package Classes;

import java.util.ArrayList;

public class MyStack<Object> {
    private final ArrayList<Object> stack = new ArrayList<>();

    public void push(Object o){
        stack.add(0,o);
    }

    public Object pop(){
        return stack.remove(0);
    }
}
