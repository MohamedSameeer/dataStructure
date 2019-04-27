public class Main {

    public static void main(String[] args)  {

      Stack<String>list=new ArrayStack<>();
      list.push("Ahmed");
        list.push("Ahmed5");
        list.push("Ahmed4");
        list.push("Ahmed3");
        list.push("Ahmed2");
        System.out.println(list.getTop());
        list.pop();
        System.out.println(list.getTop());
        System.out.println(list.size());
        list.clear();
        list.pop();
        System.out.println(list.getTop());
    }
}
