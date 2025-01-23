import java.util.*;
class Isomorphic_words
{
    public static void main()
    {
        String s1="",s2="";
        int l1=0,l2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two words: ");
        s1=sc.next();
        s2=sc.next();
        l1=s1.length();
        l2=s2.length();
        if(l1!=l2)
        System.out.println("The two strings are not isomorphic");
        else
        {
            String s3=s2;
            String s4="";
            for(int i=0;i<l1;i++)
            {
                if(s4.indexOf(s3.charAt(i))==-1)
                {
                s3=s3.replaceAll(Character.toString(s3.charAt(i)),Character.toString(s1.charAt(i)));
                s4=s4+s3.charAt(i);
                }
            }
            System.out.println("s1="+s1);
            System.out.println("s3="+s3);
            if(s3.equals(s1))
            System.out.println("The two strings are Isomorphic");
            else
            System.out.println("The two strings are not Isomorphic");
            sc.close();
        }
    }
}