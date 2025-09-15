import java.util.*;
class EqMat
{
     int a[][];
     int m,n;
     EqMat(int mm,int nn)
     {
          m=mm;
          n=nn;
     }
     void readarray()
     {
          int a[][]=new int[m][n];
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter "+(m*n)+" elements into the matrix:");
          for(int i=0;i<m;i++)
          {
               for(int j=0;j<n;j++)
               {
                    a[i][j]=sc.nextInt();
               }
          }
     }
     int check(EqMat P,EqMat Q)
     {
          for(int i=0;i<m;i++)
               for(int j=0;j<n;j++)
                    if(P.a[i][j]!=Q.a[i][j])
                         return 0;
          return 1;
     }
     void print()
     {
          for(int i=0;i<m;i++)
               for(int j=0;j<n;j++)
                    System.out.print(a[i][j]+", ");
          System.out.println();
     }

}
class ObjectPassing
{
     public static void main(String[] args) 
     {
         int m=0,n=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number of rows: ");
         m=sc.nextInt();
         System.out.println("Enter number of columns: ");
         n=sc.nextInt();

         EqMat ob1=new EqMat(m,n);
         ob1.readarray();
         EqMat ob2=new EqMat(m,n);
         ob2.readarray();

         System.out.println("The first matrix is: ");
         ob1.print();
         System.out.println("The second matrix is: ");
         ob2.print();
         
         EqMat ob3=new EqMat(m,n);
         if(ob3.check(ob1,ob2)==1)
               System.out.println("Both the matrix are same");
         else
               System.out.println("The matrix are different");

     }
}