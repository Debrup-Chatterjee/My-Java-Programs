import java.util.*;
class search_arrayList
{
    public static int searchvalue(ArrayList<Integer> list,int x)
    {
        return list.indexOf(x);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }

        System.out.print("Enter element to search: ");
        int ser=sc.nextInt();

        int  pos=searchvalue(list,ser);

        if(pos!= -1)
        {
            System.out.println(ser+" found at index: "+pos);
        }
        else
        {
            System.out.println(ser+" not found.");
        }
    }
}