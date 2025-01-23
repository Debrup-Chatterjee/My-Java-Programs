import java.util.*;
public class Sum {

     public static void main(String[] args)
     {
          int a,b;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter two numbers:");
          a=sc.nextInt();
          b=sc.nextInt();
          int c=a+b;
          System.out.println("Sum="+c);
          sc.close();
     }
}