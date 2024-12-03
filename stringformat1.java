import java.util.*;
public class Stringformat1
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=sc.nextInt();
        System.out.println(String.format("the name of the person is %s and age is %d",a,b));
    }
    }