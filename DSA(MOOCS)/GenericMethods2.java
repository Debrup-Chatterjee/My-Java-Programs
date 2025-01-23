public class GenericMethods2
{
     void swap(Object a,Object b)
     {
          Object c;
          c=a;
          a=b;
          b=c;
          System.out.println("After swapping: X="+a+", Y="+b);
     }
     public static void main(String[] args) 
     {
          GenericMethods2 ob1=new GenericMethods2();
          int x=10;
          int y=20;
          System.out.println("Before Swapping: X="+x+", Y="+y);
          ob1.swap(x,y);//passed by value
          String a="hello";
          String b="world";
          System.out.println("Before Swapping: X="+a+", Y="+b);
          ob1.swap(a,b);
     }
}
