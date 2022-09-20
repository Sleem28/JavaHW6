//Написать простую реализацию стека. (иметь операции push и pop)
import Classes.MyStack;


public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        System.out.println("Добавим элементы 1, 3, 11 в стэк");
        stack.push(1);
        stack.push(3);
        stack.push(11);
        System.out.println("Удалим по элементно");
        System.out.println("Удалено " + stack.pop());
        System.out.println("Удалено " + stack.pop());
        System.out.println("Удалено " + stack.pop());
    }
}
