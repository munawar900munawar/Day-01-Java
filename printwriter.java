import java.io.printwriter;
public class a{
    public static void main(String args[]){
        printwriter pw=new printwriter(System.out);
        pw.println("hello,world!");
        pw.print("This is a");
        pw.print("print statement");
        pw.close();
    }
}