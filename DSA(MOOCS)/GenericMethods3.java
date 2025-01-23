class GenericMethods3
{
     void genPrint(Object x,Object y)
     {
          //Object z=x+y;  CANNOT BE DONE
          //System.out.println(z);
          System.out.println("X="+x+" ,Y="+y);
     }
     public static void main(String[] args) 
     {
          GenericMethods3 ob1=new GenericMethods3();
          Integer x=10;
          Integer y=20;
          ob1.genPrint(x,y);
          ob1.genPrint(5.5,6.4);
          ob1.genPrint("Hello","world");
     }
}