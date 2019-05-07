import java.util.Collections;

public class MonotonicStack<E> {

    Stack<E> mainStack,maxStack;

    MonotonicStack(){
        mainStack=new LinkedListStack<>();
        maxStack=new LinkedListStack<>();
    }

    void push(E value){
        if(mainStack.isEmpty()){
            mainStack.push(value);
            maxStack.push(value);
            if (mainStack.getTop() instanceof Integer) {
                Integer cur= (Integer) value;
                if(cur.compareTo((Integer) maxStack.getTop())>=0){
                    maxStack.push(value);
                }
            } else if (mainStack.getTop() instanceof Double) {
                Double cur= (Double) value;
                if(cur.compareTo((Double) maxStack.getTop())>=0){
                    maxStack.push(value);
                }

            } else if (mainStack.getTop() instanceof String) {
                String cur= (String) value;
                if(cur.compareTo((String) maxStack.getTop())>=0){
                    maxStack.push(value);
                }

            } else if (mainStack.getTop() instanceof Long) {
                Long cur= (Long) value;
                if(cur.compareTo((Long) maxStack.getTop())>=0){
                    maxStack.push(value);
                }

            } else
                throw new IllegalArgumentException("Can use this method only with: Long - Integer - Double - String");
        }else {
            mainStack.push(value);
            if (mainStack.getTop() instanceof Integer) {
                Integer cur= (Integer) value;
                if(cur.compareTo((Integer) maxStack.getTop())>=0){
                    maxStack.push(value);
                }
            } else if (mainStack.getTop() instanceof Double) {
                Double cur= (Double) value;
                if(cur.compareTo((Double) maxStack.getTop())>=0){
                    maxStack.push(value);
                }

            } else if (mainStack.getTop() instanceof String) {
                String cur= (String) value;
                if(cur.compareTo((String) maxStack.getTop())>=0){
                    maxStack.push(value);
                }

            } else if (mainStack.getTop() instanceof Long) {
                Long cur= (Long) value;
                if(cur.compareTo((Long) maxStack.getTop())>=0){
                    maxStack.push(value);
                }

            } else
                throw new IllegalArgumentException("Can use this method only with: Long - Integer - Double - String");
        }
    }
    int size(){
        return mainStack.size();
    }
    E getMax(){
        return maxStack.getTop();
    }

    E getTop(){
        return mainStack.getTop();
    }
    void pop(){
        if(mainStack.getTop().equals(maxStack.getTop()))
        {
            mainStack.pop();
            maxStack.pop();
        }else
            mainStack.pop();
    }
    boolean isEmpty(){
        return mainStack.isEmpty();
    }
}
