public class GenericClass4<T extends Number>
{
     T arr[];
     GenericClass4(T t[])
     {
          arr=t;
     }
     double average()
     {
          double sum=0.0;
          for(int i=0;i<arr.length;i++)
               sum+=arr[i].doubleValue();
          return sum/arr.length;
     }
     public static void main(String[] args) 
     {
          Integer arr1[]={1,2,3,4,5};
          GenericClass4<Integer> ob1=new GenericClass4<Integer>(arr1);
          System.out.println("For Integers,Average is: "+ob1.average());

          Double arr2[]={1.2,2.2,3.2,4.2,5.2};
          GenericClass4<Double> ob2=new GenericClass4<Double>(arr2);
          System.out.println("For Doubles,Average is: "+ob2.average());

          //String causes error as String does not fall under Number superclass
          String arr3[]={"1","2","3","4","5"};
          //GenericClass4<String> ob3=new GenericClass4<String>(arr3);
          //System.out.println("Average is: "+ob3.average());
     }
}
