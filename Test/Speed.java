import java.util.*;
class Speed
{
    public static void main()
    {
        double distance,time,speed;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in km: ");
        distance=sc.nextDouble();
        System.out.println("Enter the time in hours: ");
        time=sc.nextDouble();
        speed=distance/time;
        System.out.println("Speed(in km/hr)= "+speed);
        speed=speed*1000/3600;
        System.out.println("Speed(in m/sec)= "+speed);
        sc.close();
    }
}