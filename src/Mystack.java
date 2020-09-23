import java.util.ArrayList;
import java.util.Stack;

public class Mystack<E> implements methodStack<E>{
    private Stack<E> element;


    public Mystack() {
        this.element = new Stack<>();
    }


    @Override
    public void push(E e) {
        element.push(e);
    }

    @Override
    public E pop() {
        if (element.empty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        else {
            return element.remove(element.size());
        }
    }


}
