//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

//public class HashMapInJava {
//    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1,"Mango");
//        map.put(2,"Apple");
//        map.put(3,"Banana");
//        map.put(4,"Grapes");
//        map.put(3, "Papaya");
        //System.out.println("Iterating Hashmap...");
       // for(Map.Entry m: map.entrySet()){
         //   System.out.println(m.getKey() + " " + m.getValue());
        //}
//        System.out.println(map);
//        System.out.println(map.containsKey(3));
//        System.out.println(map.get(4));

        //Iterating the map.
//        for(Map.Entry<Integer, String> m: map.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
//
//        //Storing only keys.
//        Set<Integer> keys = map.keySet();
//        for(Integer key:keys){
//            System.out.println(key + " " + map.get(key));
//        }
//
//        //Deleting a key
//        map.remove(4); //by deleting key only, value will delete automatically.
//        System.out.println(map);
//    }
//}

//2.
//class Hashing{
//    public static void main(String[] args) {
//        int arr1[] = {1,2,3};
//        int arr2[] = {3,4,1,5,6};
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0;i<arr1.length;i++){
//            set.add(arr1[i]);
//        }
//
//        for(int j=0;j<arr2.length;j++){
//            set.add(arr2[j]);
//        }
//
//        System.out.println(set.size());
//        System.out.println(set);
//    }
//}

//3.
//class HashMapPutMethodDemo1{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String key1 = sc.nextLine();
//        String value1 = sc.nextLine();
//        String key2 = sc.nextLine();
//        String value2 = sc.nextLine();
//        String key3 = sc.nextLine();
//        String value3 = sc.nextLine();
//        HashMap<String, String> map = new HashMap<>();
//        map.put(key1,value1);
//        map.put(key2,value2);
//        map.put(key3,value3);
//        System.out.println(map);
//    }
//}

//4.
//class CharCountDemo{
//    public static void main(String[] args) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String: ");
//        String key1 = sc.nextLine();
//        //String value1 = sc.nextLine();
//        //map.put(key1,null);
//        for(int i=0;i<key1.length();i++){
//            char c = key1.charAt(i);
//            if(map.containsKey(c)){
//                map.put(c,map.get(c)+1);
//            }
//            else{
//                map.put(c,1);
//            }
//        }
//        System.out.println(map);
//    }
//}

//5
//class FindFrequency{
//    public static void main(String[] args) {
////        int nums[] = {1,3,2,5,1,3,1,5,1};
//        int nums[] = {1,2};
//        int n = nums.length;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<n;i++) {
//            if(map.containsKey(nums[i])) {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//            else {
//                map.put(nums[i], 1);
//            }
//        }
//        for(int key:map.keySet()){
//            if(map.get(key)>n/3){
//                System.out.println("The frequency is: "+key);
//            }
//        }
//    }
//}

//6
//class HashMapIterationDemo{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String value1[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
//        HashMap<String, String> map = new HashMap<>();
//        for(String key:value1){
//            String val = key.substring(0,2);
//            map.put(val,key);
//        }
//        for(Map.Entry<String,String> m: map.entrySet()){
//            System.out.println(m.getKey()+" : "+m.getValue());
//        }
//    }
//}

//7
//class HashMapIterationDemo{
//    public static void main(String[] args) {
//        HashMap<String,String> map = new HashMap<>();
//        String arr1[] ={"Red", "White", "Black", "Brown"};
//        for(String key:arr1){
//            String val = key.substring(0,2);
//            map.put(val,key);
//        }
//        System.out.println(map);
////        for(Map.Entry<String,String> m : map.entrySet()){
////            System.out.println(m.getKey() + " : " + m.getValue());
////        }
//    }
//}

//8
class HashMapIterationDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the contacts1 and name1");
//        int contact1 = sc.nextInt();
//        String name1 = sc.nextLine();
//        System.out.println("Enter the contacts2 and name2");
//        int contact2 = sc.nextInt();
//        String name2 = sc.nextLine();
//        System.out.println("Enter the contacts3 and name3");
//        int contact3 = sc.nextInt();
//        String name3 = sc.nextLine();
        HashMap<Integer,String> map = new HashMap<>();
        map.put(70046,"Shashi");
        map.put(76350,"Bittu");
        map.put(12345,"Satya");
        //map.remove(70046);
        System.out.println(map);
        System.out.println(map.get(76350));
        System.out.println("You can add more contacts and names");
    }
}