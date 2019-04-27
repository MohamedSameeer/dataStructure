
public class LinkedListStack<E> implements Stack<E> {
    SinglyLinkedList<E> list;
    LinkedListStack() {
        list = new SinglyLinkedList<>();
    }
    @Override
    public void push(E value) {
        list.pushFront(value);
    }

    @Override
    public void pop()        //O(1)
    {
        list.popFront();
    }

    @Override
    public int size()  //O(1)
    {
        return list.size();
    }

    @Override
    public E getTop()        //O(1)
    {
        if(size()!=0)
            return list.getFront();
        throw new NullPointerException("Stack is Empty .... can't get element");
    }

    @Override
    public void clear()          //O(1)
    {
        list.clear();
    }

    @Override
    public boolean isEmpty()        //O(1)
    {
        return list.isEmpty();
    }
}
