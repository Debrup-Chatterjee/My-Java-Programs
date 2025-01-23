public class GenericMethods4 
{
    /*This program demonstrates that the values of object cannot be directly
     accessed and hence the output is with error*/
     String name;
     Double marks;
     GenericMethods4(String name,Double marks)
     {
          this.name=name;
          this.marks=marks;
     }
     public static void swap(Object x,Object y)
     {
          Object t;
          t=x;
          x=y;
          y=t;
          System.out.println("After Swapping: x="+x+" y="+y);
     }
     public static void main(String[] args) 
     {
          GenericMethods4 x=new GenericMethods4("Sumit",99.9);
          GenericMethods4 y=new GenericMethods4("Rahul",66.6);
          System.out.println("Before Swapping: x="+x+" y="+y);
          swap(x,y);
     }
}
