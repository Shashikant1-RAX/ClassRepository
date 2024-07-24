import java.util.*;
public class HashMapPutMethodDemo {
    public static void main(String args[]){
        Map<String,String> nm = new HashMap<>();
        Scanner sc =new Scanner(System.in);
        String s1 = sc.nextLine();
        String c1 = sc.nextLine();
        String s2 = sc.nextLine();
        String c2 = sc.nextLine();
        String s3 = sc.nextLine();
        String c3 = sc.nextLine();
        nm.put(s1,c1);
        nm.put(s2,c2);
        nm.put(s3,c3);
        System.out.println(nm);
    }
}
