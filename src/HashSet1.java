import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(2);
        hs1.add(4);
        hs1.add(9);
        System.out.println(hs1.isEmpty());
        System.out.println("The size of HashSet is: " + hs1.size());
        hs1.remove(9);
        System.out.println(hs1);
        hs1.clear();
        System.out.println(hs1);
    }
}
