public class SinglyLinkedList<E> {

    private static class Node<E>{

        private E value;
        private Node<E> nextNode;

        private Node(){}
        private Node(E value){
            this.value=value;
        }

        private E getValue() {
            return value;
        }

        private void setValue(E value) {
            this.value = value;
        }

        private Node<E> getNextNode() {
            return nextNode;
        }

        private void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }
    }

    private Node<E> front;
    private int size;
    private Node<E>back;
    public E getFront()     //O(1)
    {
        if(!isEmpty())
            return front.getValue();
        throw new NullPointerException("list is Empty .... can't get element");
    }

    public void pushFront(E value)      //O(1)
    {
        Node<E> newNode=new Node<>();
        newNode.setValue(value);
        newNode.setNextNode(front);
        front=newNode;
        ++size;
    }


    public void popFront()     //O(1)
    {
        if(!isEmpty()){
            front=front.getNextNode();
            --size;
        }else
            throw new NullPointerException("List is Empty.... ");
    }


    public int size()       //O(1)
    {
        return size;
    }


    public boolean isEmpty()    //O(1)
    {
        return size==0;
    }


   public void clear()      //O(1)
    {
        size=0;
        front=null;
    }

   /* public void pushBack(E value) //O(1)
    {
        Node<E> newNode=new Node<>(value);


        ++size;
    }*/

    public E get(int index)    //O(n)
    {
        if (index < size && index >= 0) {
            Node<E> current = front;
            for (int i = 0; i < index; i++) {
                current = current.getNextNode();
            }
            return current.getValue();
        }else
            throw new NullPointerException("No Element at index "+index);

    }


    public void insert(int index, E value)     //O(n)
    {
        if(index < size && index > 0) {
            Node<E> current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNextNode();
            }
            Node<E> newNode = new Node<>();
            newNode.setValue(value);
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
            ++size;
        }else if(index==0)
            pushFront(value);
        else
            throw new NullPointerException("Can't Access index "+index);
    }


    public void remove(int index){   //O(n)

        if(index < size && index > 0) {
            --index;
            Node<E> current = front;
            for (int i = 0; i <index; i++) {
                current = current.getNextNode();
            }
            current.setNextNode(current.getNextNode().getNextNode());
            --size;
        }else if(index==0 && !isEmpty())
            popFront();
        else
            throw new NullPointerException("Can't Access index "+index);
    }


    public int find(E value)    //O(n)
    {
        Node<E>cur=front;
        for(int i=0;i<size;i++){
            if(cur.getValue()==value)
                return i;
        }
        return -1;
    }

}
