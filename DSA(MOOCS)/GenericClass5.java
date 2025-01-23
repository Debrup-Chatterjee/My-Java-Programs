public class GenericClass5<T extends Number>
{
     String name;
     T marks[];
     GenericClass5(T t[])
     {
          marks=t;
     }
     double total()
     {
          double sum=0.0;
          for(int i=0;i<marks.length;i++)
          sum+=marks[i].doubleValue();
          return sum;
     }
     boolean compareMarks(GenericClass5<?> others)
     {
          if(total()==others.total())
          return true;
          return false;
     }
     public static void main(String[] args) 
     {
          Integer arr1[]={1,2,3,4,5};
          GenericClass5<Integer> ob1=new GenericClass5<Integer>(arr1);
          System.out.println("For Student 1,Total marks is: "+ob1.total());

          Integer arr2[]={6,7,8,9,10};
          GenericClass5<Integer> ob2=new GenericClass5<Integer>(arr2);
          System.out.println("For Student 2,Total marks is: "+ob2.total());
          
          if(ob1.compareMarks(ob2))
          System.out.println("Same");
          else
          System.out.println("Not same");
          Double arr3[]={1.2,2.2,3.2,4.2,5.2};
          GenericClass5<Double> ob3=new GenericClass5<Double>(arr3);
          System.out.println("For Student 3,Total marks is: "+ob3.total());
          if(ob1.compareMarks(ob3))
          System.out.println("Same");
          else
          System.out.println("Not same");
          
     }
}
