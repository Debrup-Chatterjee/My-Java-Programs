public class year
{
    public static void main()
    {
        int y=2025;
        {
            if (y%4==0)
            System.out.println("leap year");
            else if(y%400==0)
            System.out.println("century leap year");
            else if(y%100==0)
            System.out.println("century year but not a leap year");
            else
            System.out.println("neither century year nor a leap year");
        }
    }
}