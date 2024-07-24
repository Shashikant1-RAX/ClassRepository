//class Circle1{
//    int radius;
//    Circle1(int r){
//        System.out.println("I am constructor of class Area");
//        this.radius = r;
//    }
//    Double getArea(){
//        return 3.14*this.radius*this.radius;
//    }
//}
//class Cylinder1 extends Circle1{
//    int height;
//    Cylinder1(int h,int r){
//        super(r);
//        System.out.println("I am constructor of class Cylinder");
//        this.height = h;
//    }
//    double getVolume(){
//        return 3.14*this.radius*this.radius*this.height;
//    }
//
//}
// question 2:
//class Rectangle1{
//    int length;
//    int breadth;
//    Rectangle1(int l, int b){
//        System.out.println("i am constructor of class Rectangle1");
//        this.length = l;
//        this.breadth = b;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getBreadth() {
//        return breadth;
//    }
//
//    public void setBreadth(int breadth) {
//        this.breadth = breadth;
//    }
//    int recArea(){
//        return length*breadth;
//    }
//}
//class Cuboid1 extends Rectangle1{
//    int height;
//    Cuboid1(int h, int l, int b){
//        super(l,b);
//        System.out.println("i am constructor of class Cuboid1");
//        this.height = h;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    int cubVolume(){
//        return length*breadth*height;
//    }
//}
//public class PracticeQuesInheritance {
//    public static void main(String[] args) {
////        Cylinder1 c = new Cylinder1(4,5);
////        System.out.println(c.getVolume());
////        System.out.println(c.getArea());
//        Cuboid1 cb = new Cuboid1(6,7,8);
//        System.out.println(cb.recArea());
//        System.out.println(cb.cubVolume());
//    }
//}

//Exercise1.
// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
class Library{
    String bookarr[];
    int no_of_books;
    Library(){
        bookarr = new String[50];
        no_of_books = 0;
    }
    public void addBook(String book){
        this.bookarr[no_of_books] = book;
        no_of_books++;
        System.out.println(book +" has been added.");
    }
    public void showAvailableBook(){
        System.out.println("Available books are: ");
        for(String book : bookarr){
            if(book == null){
                continue;
            //System.out.println(" * " + book);
            }
            System.out.println(" * " + book);
        }
        //System.out.println("Book is not available. ");
    }
    public void issueBook(String book){
        for(int i=0;i<this.bookarr.length;i++){
            if(this.bookarr[i].equals(book)) {
                System.out.println(book +" has been issued.");
                this.bookarr[i] = null;
                return;
            }
        }
    }
    public void returnBook(String book){
        addBook(book);
    }
}
class Exercise1Book{
    public static void main(String[] args) {
        Library lb = new Library();
        lb.addBook("Comptia Security+");
        lb.addBook("Programming with java");
        lb.addBook("Advanced Physics");
        lb.showAvailableBook();
        lb.issueBook("Comptia Security+");
        lb.showAvailableBook();
        lb.returnBook("Comptia Security+");
        lb.showAvailableBook();


    }
}