import java.util.EmptyStackException;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

    }
}

class Stack extends Vector {

    public Object push(Object o) {
        addElement(o);
        return o;
    }

    public boolean empty() {
        return size() == 0;
    }

    public Object pop() {
        Object item = peek();
        remove(item);
        return item;
    }

    public Object peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return elementAt(size() - 1);
    }
}