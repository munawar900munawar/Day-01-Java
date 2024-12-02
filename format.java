import java.util.*;
public class format{
    public static void main(String args[]){
        //accepting a string
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=String.format("congratulations %s you won 5 lakhs",a);
        System.out.println(b);
    }
}