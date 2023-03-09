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
}