import java.util.ArrayDeque;
public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(90);
        ad1.add(78);
        ad1.addFirst(89);
        ad1.addLast(67);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.isEmpty());
        System.out.println(ad1.contains(89));
        System.out.println(ad1);
    }
}
