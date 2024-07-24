import java.util.LinkedList;

public class LinkedListInJava {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(4);
        l1.add(9);
        l1.add(45);
        l2.add(23);
        l2.add(344);
        l2.add(745);
        l1.addAll(l2);
        l1.addLast(900);
        l1.remove(4);
        System.out.println("The size of Linked List l1 is: " + l1.size());
        System.out.println(l1.get(1));
        for(int a:l1) {
            System.out.print(a);
            System.out.print(", ");
        }
    }
}
