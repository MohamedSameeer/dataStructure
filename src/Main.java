public class Main {

    public static void main(String[] args)  {

        SinglyLinkedList<Integer> list=new SinglyLinkedList<>();
        list.pushFront(4);
        list.pushFront(3);
        list.pushFront(2);

        list.insert(1,10);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));

        System.out.println();

        list.insert(0,500);
        System.out.println(list.getFront());

        ///

        Fraction f = new Fraction(1,1 );
        f.simplify().print();
        f.add(new Fraction(1, 6)).print();
    }
}
