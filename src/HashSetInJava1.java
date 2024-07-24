import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava1 {
    public static void main(String[] args) {
        HashSet<Integer> mhs = new HashSet<>();
        mhs.add(67);
        mhs.add(76);
        mhs.add(90);
        mhs.add(67);
        mhs.add(67);
        System.out.println("The Size of HashSet is: " + mhs.size());
        System.out.println(mhs);
//        for (Integer mh : mhs) {
//            System.out.println(mh);
//        }
        Iterator it = mhs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
