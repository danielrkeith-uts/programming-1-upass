import java.util.LinkedList;

public class Stack<T> {

    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<T>();
    }

    public void push(T obj) {
        list.add(obj);
    }

    public T pop() {
        if (list.isEmpty()) {
            return null;
        }

        return list.remove(list.size() - 1);
    }

}
