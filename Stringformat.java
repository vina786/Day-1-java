import java.util.*;
public class Stringformat
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=String.format("congrulations %s you won 5 lakhs",a);
        System.out.println(b);
    }
}