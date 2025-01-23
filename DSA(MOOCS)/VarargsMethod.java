public class VarargsMethod 
{
     static void Something(Object ...v)
     {
          System.out.println("Number of arguments: "+v.length+" \nElements:");
          for(Object x:v)
               System.out.print(x+" ");
          System.out.println();
     }
     public static void main(String[] args) 
     {
          Something(1,"String",2.3,true);
          Something(1,-2,-3,-4,5);
          Something();
     }
}
