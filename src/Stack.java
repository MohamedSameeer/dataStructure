public interface Stack<E> {

    void push(E value);
    void pop();
    int size();
    E getTop();
    void clear();
    boolean isEmpty();


}
