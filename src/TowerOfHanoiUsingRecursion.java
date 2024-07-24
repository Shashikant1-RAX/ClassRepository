import java.util.Scanner;

public class TowerOfHanoiUsingRecursion {
    static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n == 1){
            System.out.println("transferred disk " + n + " from " + src + " to destination " + dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transferred disk " + n + " from " + src + " to destination " + dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n,"S","H","D");
    }
}
