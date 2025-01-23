public class GenericClass3<T1,T2>
{
     T1 a;
     T2 b;
     public GenericClass3(T1 x, T2 y) {
          this.a = x;
          this.b = y;
     }
     public void print()
     {
          System.out.print(a+",");
          System.out.println(b);
     }
     public static void main(String[] args)
     {
          GenericClass3<String,Integer> ob1=new GenericClass3<>("Hello",1);
          ob1.print();
          GenericClass3<Integer,Double> ob2=new GenericClass3<>(5,5.5);
          ob2.print();
     }
}
