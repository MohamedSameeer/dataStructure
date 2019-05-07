public class ArrayList<E> {

    private int capacity=1;
    private int size=0;
    private E [] mainArray;

    ArrayList(){
        mainArray= (E[]) new Object[capacity];
    }

    ArrayList(int capacity){
        mainArray= (E[]) new Object[capacity];
    }

    E get(int index){
        if(index>=size){
            throw new NullPointerException("Index "+index +" is empty");
        }
        return mainArray[index];
    }

    void add(E value){
        if(size==capacity)
        {
            capacity=capacity*2;
            E[] arr=(E[]) new Object[capacity];
            if (size >= 0) System.arraycopy(mainArray, 0, arr, 0, size);
            mainArray=arr;
        }
        mainArray[size]=value;
        size++;
    }

    void remove(int index){
        if(index>=size){
            throw new NullPointerException("Index "+index +" is empty");
        }
        size--;
        for(int i=index+1,j=index;j<size;i++,j++){
            mainArray[j]=mainArray[i];
        }
    }

    void insert(int index, E value){
        if(index>size || index<0)
            throw new ArrayIndexOutOfBoundsException();

        else if(index ==size)
            add(value);

        else{
            add(value);
            for(int i=size-1;i>index; i--){
                E temp=mainArray[i];
                mainArray[i]=mainArray[i-1];
                mainArray[i-1]=temp;
            }
        }
    }


    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

}
