//import  java.util.Scanner;
//
//public class SalesDataManager {
//
//    static final int N = 10;
//    String[] names = new String[N];
//    int[] sales = new int[N];
//    double[] commissionCal = new double[N];
//    Scanner sc = new Scanner(System.in);
//    int totalEntries = 0;
//    int choice;
//
//    public void displayMenu(){
//        do{
//            System.out.println("\nMenu:");
//            System.out.println("1. Input & validate data");
//            System.out.println("2. Display");
//            System.out.println("3. Sort by name");
//            System.out.println("4. Sort by sales");
//            System.out.println("5. Search by name");
//            System.out.println("6. Search by sales");
//            System.out.println("7. Display statistics");
//            System.out.println("8. Exit");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//            sc.nextLine();
//
//            switch(choice){
//                case 1:
//                    inputData();
//                    break;
//                case 2:
//                    display();
//                    break;
//                case 3:
//                    sortByNames();
//                    display();
//                    break;
//                case 4:
//                    sortBySales();
//                    display();
//                    break;
//                case 5:
//                    searchByName();
//                    break;
//                case 6:
//                    searchBySales();
//                    break;
//                case 7:
//                    displayStatistics();
//                    break;
//                case 8:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }while(choice != 8);
//    }
//
//    public void inputData() {
//        for (int i = 0; i < N; i++) {
//            String name;
//            int salesAmount;
//            while (true) {
//                System.out.print("Enter " + (i+1) + "  salesperson's name: ");
//                name = sc.nextLine();
//                if(!name.matches("[A-Za-z]+\\s[A-Za-z]+")){
//                    System.out.println("Invalid name. Please enter a valid name.");
//                }
//                else{
//                    break;
//                }
//            }
//
//            while (true) {
//                System.out.print("Enter " + (i+1) + " sales amount (in $1000, between 10 and 100): ");
//                salesAmount = sc.nextInt();
//                sc.nextLine();
//                if (salesAmount >= 10 && salesAmount <= 100) {
//                    break;
//                } else {
//                    System.out.println("Invalid sales amount. Please enter a value between 10 and 100.");
//                }
//            }
//            double commission = calculateCommission(salesAmount);
//            names[totalEntries] = name;
//            sales[totalEntries] = salesAmount;
//            commissionCal[totalEntries] = commission;
//            totalEntries++;
//        }
//    }
//
//    public void display() {
//        System.out.println("\nSalesperson Data:");
//        System.out.printf("%-20s %-10s %-10s\n", "Name", "Sales", "Commission");
//        for (int i = 0; i < N; i++) {
//            System.out.printf("%-20s %-10d $%-10.2f\n", names[i], sales[i], commissionCal[i]);
//        }
//    }
//    public void sortByNames(){
//        for(int i=0; i<totalEntries;i++){
//            for(int j=i+1; j<totalEntries;j++){
//                if(names[i].compareTo(names[j])>0){
//                    swapIn(i,j);
//                }
//            }
//        }
//    }
//    public void sortBySales(){
//        for(int i=0; i<totalEntries;i++){
//            for(int j=i+1; j<totalEntries;j++){
//                if(sales[i]> sales[j]){
//                   swapIn(i,j);
//                }
//            }
//        }
//    }
//    public void searchByName(){
//        System.out.print("Enter the name you want to search: ");
//        String searchName = sc.nextLine().toLowerCase();
//        boolean found = false;
//
//        for(int i = 0; i < totalEntries; i++){
//            if(names[i].toLowerCase().equals(searchName)){
//                System.out.printf("Name: %s, Sales: %d, Commission: $%.2f\n", names[i], sales[i], commissionCal[i]);
//                found = true;
//                break;
//            }
//        }
//
//        if(!found){
//            System.out.println("No name matches");
//        }
//    }
//
//    public void searchBySales(){
//        System.out.print("Enter a specific amount of sales to search: ");
//        int searchSales = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Salesperson(s) with sales amount less than $" + (searchSales * 1000) + ":");
//        boolean found = false;
//        for(int i = 0; i < totalEntries; i++){
//            if(sales[i] < searchSales){
//                System.out.printf("Name: %s, Sales: %d, Commission: %.2f\n", names[i], sales[i], commissionCal[i]);
//                found = true;
//            }
//        }
//        if(!found){
//            System.out.println("No salespersons found with sales amount less than $" + (searchSales * 1000) + ".");
//        }
//    }
//    public void displayStatistics(){
//        if (totalEntries == 0) {
//            System.out.println("No data available.");
//            return;
//        }
//        int minIndex = 0;
//        int maxIndex = 0;
//        int totalSales = 0;
//
//        for(int i = 0; i < totalEntries; i++){
//            if(sales[i] < sales[minIndex]){
//                minIndex = i;
//            }
//            if(sales[i] > sales[maxIndex]){
//                maxIndex = i;
//            }
//            totalSales += sales[i];
//        }
//
//        System.out.printf("Lowest Sales: $%d by %s\n", sales[minIndex]*1000, names[minIndex]);
//        System.out.printf("Highest Sales: $%d by %s\n", sales[maxIndex]*1000, names[maxIndex]);
//
//    }
//
//    public double calculateCommission(int salesAmount){
//        double realAmount = salesAmount*1000;
//        if (realAmount >= 10000 && realAmount <= 25000) {
//            return 0.05 * realAmount;
//        }
//        if (realAmount > 25000 && realAmount <= 50000) {
//            return 0.06 * realAmount;
//        }
//        if (realAmount > 50000 && realAmount <= 75000) {
//            return 0.08 * realAmount;
//        }
//        else{
//            return 0.10 * realAmount;
//        }
//    }
//
//    public void swapIn(int i, int j){
//        String temp = names[i];
//        names[i] = names[j];
//        names[j] = temp;
//
//        int tempSales = sales[i];
//        sales[i] = sales[j];
//        sales[j] = tempSales;
//
//        double tempCal = commissionCal[i];
//        commissionCal[i] = commissionCal[j];
//        commissionCal[j] = tempCal;
//    }
//    public static void main(String args[]) {
//        SalesDataManager sdm = new SalesDataManager();
//        sdm.displayMenu();
//    }
//}



//import java.util.Scanner;
//
//class ArrayInput {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the size of the arrays: ");
//        int size = scanner.nextInt();
//
//        int[] array1 = new int[size];
//        int[] array2 = new int[size];
//
//        takeInput(array1, array2, scanner);
//
//        // Print arrays to verify the input
//        System.out.println("Array 1: ");
//        for (int i : array1) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        System.out.println("Array 2: ");
//        for (int i : array2) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public static void takeInput(int[] array1, int[] array2, Scanner scanner) {
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print("Enter element " + (i + 1) + " for the first array: ");
//            array1[i] = scanner.nextInt();
//            System.out.print("Enter element " + (i + 1) + " for the second array: ");
//            array2[i] = scanner.nextInt();
//        }
//    }
//}

//import java.util.Scanner;
//import java.io.*;
//class SalesDataManager {
//    Scanner sc = new Scanner(System.in);
//    final int n = 3;
//    int c;
//    String name[]=new String [n];
//    int amount[]=new int[n];
//    double commissionsCal[] = new double[n];
////    String Sname;
////    int Samount;
//    int totalEntries = 0;
//    void operate() throws IOException{
//        do{
//            System.out.println("1. Input & validate data");
//            System.out.println("2. Display");
//            System.out.println("3. Sort by name");
//            System.out.println("4. Sort by sales");
//            System.out.println("5. Search by name");
//            System.out.println("6. Search by sales");
//            System.out.println("7. Display Statistics");
//            System.out.println("8. Exit");
//
//            System.out.print("Enter options 1-8: ");
//            c= sc.nextInt();
//            sc.nextLine();
//
//            switch(c){
//                case 1:
//                    inputData();
//                    break;
//                case 2:
//                    displayMenu();
//                    break;
//                case 3:
//                    sortByName();
//                    break;
//                case 4:
//                    sortBySales();
//                    break;
//                case 5:
//                    searchByName();
//                    break;
//                case 6:
//                    searchBySales();
//                    break;
//                case 7:
//                    displayStatistics();
//                case 8:
//                    System.exit(1);
//                    break;
//                default:
//                    break;
//
//
//            }
//        } while(c<8);
//    }
//    public void inputData() throws IOException{
//        for (int i = 0; i < n; i++) {
//            boolean valid = false;
//            String Sname;
//            int Samount;
//
//            while (true) {
//                System.out.print("Please Enter Sales person Name " + (i + 1) + ": ");
//                Sname = sc.nextLine();
//
//                if (isValidName(Sname)) {
//                    valid = true;
//                    name[i] = Sname;
//                    break;
//                } else {
//                    System.out.println("Please Re-enter Valid Name.");
//                }
//            }
//
//            while (true) {
//                System.out.print("Please Enter sales amount between range (10-100): ");
//                Samount = sc.nextInt() * 1000;
//                sc.nextLine();  // Consume newline left-over after nextInt()
//
//                if (Samount >= 10000 && Samount <= 100000) {
//                    amount[i] = Samount;
//                    break;
//                } else {
//                    System.out.println("Invalid Range, Please Re-enter sales amount.");
//                }
//            }
//            commissionsCal[totalEntries] = calculateCommission(Samount);
//            totalEntries++;
//        }
//    }
//
//    public void displayMenu() throws IOException{
////        int totalEntries =0;
//        for(int i=0;i<n;i++){
//            System.out.println("Sales Person Name: "+name[i]+" Sales Person Amount: "+amount[i]+" Commission: "+ commissionsCal[i]);
//            //totalEntries++;
//        }
//        System.out.println("Total "+totalEntries+" data Entries");
//    }
//    public void sortByName() throws IOException{
//        for (int i = 0; i < name.length - 1; i++) {
//            for (int j = 0; j < name.length - 1 - i; j++) {
//                if (name[j].compareTo(name[j + 1]) > 0) {
//                    swap(j,j+1);
//                }
//            }
//        }
//        displayMenu();
//    }
//    public void sortBySales() throws IOException{
//        for(int i = 0; i < amount.length - 1; i++) {
//            for(int j = 0; j < amount.length - 1 - i; j++) {
//                if(amount[j] > amount[j + 1]) {
//                    swap(j,j+1);
//                }
//            }
//        }
//        displayMenu();
//    }
//    public void searchByName() throws IOException{
//        boolean found=false;
//        while(true){
//            System.out.print("Please enter the name to serach: ");
//            String nme=sc.nextLine().toLowerCase();
//            for(int i =0;i<n;i++){
//                if((name[i].toLowerCase()).equals(nme)){
//                    found = true;
//                    System.out.println("Sales Person Name: "+name[i]+" Sales Person Amount: "+amount[i]+" Commission: "+ commissionsCal[i]);
//                    break;
//
//                }
//            }
//            if(!found){
//                System.out.println("Name not found, Please Re-Enter Name: ");
//            }else{
//                break;
//            }
//
//        }
//    }
//    public void searchBySales() throws IOException{
//        boolean found = false;
//        while(true){
//            System.out.println("Please Enter sales amount to search: ");
//            int amnt=sc.nextInt();
//            for(int i=0;i<n;i++){
//                if(amount[i]<amnt){
//                    found = true;
//                    System.out.println("Sales Person Name: "+name[i]+" Sales Person Amount: "+amount[i]+" Commission: "+commissionsCal[i]);
//                    break;
//                }
//            }
//            if(!found){
//                System.out.println("Not found, Please Re-enter sales amount to search: ");
//            }else{
//                break;
//            }
//        }
//    }
//    public void displayStatistics() throws IOException{
//        System.out.println(amount[0]);
//        System.out.println(amount[amount.length-1]);
//        System.out.println(amount[((amount.length-1)/2)]+amount[amount.length/2]);
//    }
//    public boolean isValidName(String name) throws IOException{
//        String regex = "^[A-Za-z]+\\s[A-Za-z]+";
//        return name.matches(regex);
//    }
//    public void swap(int i, int j){
//        String temp = name[i];
//        name[i] = name[j];
//        name[j] = temp;
//
//        int tempSales = amount[i];
//        amount[i] = amount[j];
//        amount[j] = tempSales;
//
//        double tempCal = commissionsCal[i];
//        commissionsCal[i] = commissionsCal[j];
//        commissionsCal[j] = tempCal;
//    }
//    public double calculateCommission(int salesAmount) throws IOException{
//        double Commission = 0;
//        double actualAmount = salesAmount*1000;
//        if(salesAmount >=10000 && salesAmount<=25000){
//            Commission= salesAmount * 0.05;
//        }
//        else if(salesAmount > 25000 && salesAmount<=50000){
//            Commission= salesAmount * 0.06;
//        }
//        else if(salesAmount > 50000 && salesAmount <= 75000){
//            Commission= salesAmount * 0.08;
//        }
//        else if(salesAmount > 75000 && salesAmount <= 100000){
//            Commission= salesAmount * 0.10;
//        }
////        else {
////            Commission= -1;
////        }
//        return Commission;
//    }
//}
//class Assignment1{
//    public static void main(String[] args) throws IOException{
//        SalesDataManager manager = new SalesDataManager();
//        manager.operate();
//    }
//}