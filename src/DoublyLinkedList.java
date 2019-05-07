public class DoublyLinkedList<E>  {

    private static class Node<E>{

      private   Node<E>pre;
      private   Node<E>next;
      private   E value;
        Node(){}
        Node(E value){
            this.value=value;
        }

        public Node<E> getPre() {
            return pre;
        }

        public void setPre(Node<E> pre) {
            this.pre = pre;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }
    }

    private Node<E>front;
    private Node<E>back;
    private int size;

    void addFront(E value){
        Node<E> newNode=new Node<>(value);
        newNode.setNext(front);
        if(isEmpty()) {
            back=newNode;
        }
        else
            front.setPre(newNode);

        front=newNode;
        size++;
    }

    private boolean isEmpty() {
        return size==0;
    }

    E get(int index){
        if(index>=size)
            throw new NullPointerException("Index "+index+" Greater than size");
        Node<E>ans=front;
        for(int i=0;i<index;i++){
            ans=ans.getNext();
        }
        return ans.getValue();
    }

    void addBack(E value){
        Node<E> newNode=new Node<>(value);
        newNode.setPre(back);
        back.setNext(newNode);
        back=newNode;
        size++;
    }

    int size(){
        return size;
    }

    void removeFront(){
        if (isEmpty())
            throw new NullPointerException("No Data in List");
        front=front.getNext();
        front.setPre(null);
        size--;
    }

    void removeBack(){
        if (isEmpty())
            throw new NullPointerException("No Data in List");
        back=back.getPre();
        back.setNext(null);
        size--;
    }
}
