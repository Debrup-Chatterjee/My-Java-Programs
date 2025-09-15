public class RepeatArray
{
     public static void main(String[] args) 
     {
          int i=0;
          int[] input={1,2,3,4,5};
          int output[]=new int[input.length*2];
          while(i<output.length)
          {
               output[i]=input[i%input.length];
               i++;
          }
          System.out.println("The output list is:");
          for(i=0;i<output.length-1;i++)
               System.out.print(output[i]+",");
          System.out.println(output[i]);
     }
}
