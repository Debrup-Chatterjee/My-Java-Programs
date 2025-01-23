class GenericMethods1<T>
{
     void genPrint(T x)//we can also simply write Object instead of template T
     {
          System.out.println(x);
          /*does not support operators like + between two parameters unless 
          instanceOf is used*/
     }
     public static void main(String[] args) 
     {
          GenericMethods1<Integer> ob1=new GenericMethods1<>();
          ob1.genPrint(10);
          GenericMethods1<Double> ob2=new GenericMethods1<>();
          ob2.genPrint(5.5);
          GenericMethods1<String> ob3=new GenericMethods1<>();
          ob3.genPrint("Hello");
     }
}