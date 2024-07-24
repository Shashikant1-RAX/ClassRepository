class Marks{
    int id;
    float javaMarks,cppMarks,cMarks;

    public void setJavaMarks(float javaMarks) {
        this.javaMarks = javaMarks;
    }

    public void setCppMarks(float cppMarks) {
        this.cppMarks = cppMarks;
    }

    public void setCMarks(float cMarks) {
        this.cMarks = cMarks;
    }

    public void setId(int id) {
        this.id = id;
    }
    void DisplayMarks(){
        System.out.println("The javaMarks is: "+javaMarks);
        System.out.println("The cMarks is: "+cMarks);
        System.out.println("The cppMarks is: "+cppMarks);

    }
}
    class Result1 extends Marks{
        float avg, total;
        void Compute(){
            System.out.println(total=javaMarks+cMarks+cppMarks);
            System.out.println(avg = total/3);
        }
    }
public class TestMarks {
    public static void main(String[] args) {
        Result1 r= new Result1();
        r.setCMarks(84);
        r.setCppMarks(98);
        r.setJavaMarks(100);
        //System.out.println(r.Compute());
        r.DisplayMarks();
        r.Compute();

    }
}
