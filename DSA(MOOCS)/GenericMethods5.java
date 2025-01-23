class GenericMethods5
{
     <T>void genPrint(T x)/*Instead of making the entire class generic,we only make this method know about
     the generic type <T>*/
     {
          System.out.println(x);
     }
     public static void main(String[] args) 
     {
          GenericMethods5 ob=new GenericMethods5();
          ob.genPrint(5);
          ob.genPrint(5.5);
          ob.genPrint("Hello world");
     }
}