import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Bank1{
    long accountNo;
    float balance;
    String name;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    public void operateCustomer(){

    }
    public void inputData1() throws IOException {
        System.out.print("Enter the Account Name: ");
        String name = br.readLine();
        System.out.print("Enter the account Number: ");
        long accountNo = Long.parseLong(br.readLine());
        System.out.print("Enter the Account balance: ");
        float balance = Float.parseFloat(br.readLine());
    }
    public void depositMoney() throws IOException {
        System.out.print("Enter the monet to deposit: ");
        float balance = Float.parseFloat(br.readLine());
        balance += balance;
    }
    public void withdrawMoney() throws IOException{
        System.out.print("Enter the money to withdraw");
        float withdbal = Float.parseFloat(br.readLine());
        if(withdbal<balance){
            balance -= withdbal;
        }
        else{
            System.out.println("Insufficient Ammount");
        }
    }
    public void showCustomerData(){
        System.out.println("name is: " + name);
        System.out.println("Account is: " +accountNo);
        System.out.println("balance is: " + balance);

    }

}
public class BankWork {
    public static void main(String args[]){

    }
}
