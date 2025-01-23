public class GenericClass1 <T>
{
     T x;
     public GenericClass1(T t)
     {
          x=t;
     }
     public  void printData()
     {
          System.out.println(x);
     }
     public static void main(String[] args) 
     {
          GenericClass1<String> a=new GenericClass1<String>("Java");
          a.printData();
          GenericClass1<Integer> b=new GenericClass1<Integer>(123);
          b.printData();
          GenericClass1<Double> c=new GenericClass1<Double>(3.142);
          c.printData();
     }
}
