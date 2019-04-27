public class ArrayStack<E> implements Stack<E> {
    E[] arr;
    int size;
    private final static int CAPACITY=1000;
    ArrayStack(){
        arr =(E[]) (new Object[CAPACITY]) ;
    }
    @Override
    public void push(E value)           //O(1)
    {
        if(size==arr.length){
            throw new NullPointerException("can't access element greater than size");
        }else {
            arr[size]=value;
            ++size;
        }
    }

    @Override
    public void pop()           //O(1)
    {
        if(!isEmpty())
            --size;
        else
            throw new NullPointerException("Array is Empty");
    }

    @Override
    public int size()       //O(1)
    {
        return size;
    }

    @Override
    public E getTop()           //O(1)
    {
        if(!isEmpty())
            return arr[--size];
        throw new NullPointerException("Array is Empty");

    }

    @Override
    public void clear()         //O(1)
    {
        size=0;
    }

    @Override
    public boolean isEmpty()        //O(1)
    {
        return size==0;
    }
}
