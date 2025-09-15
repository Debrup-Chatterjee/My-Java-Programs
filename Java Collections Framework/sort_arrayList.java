import java.util.*;
public class sort_arrayList
{
    public static void sortlist(ArrayList<Integer> list)
    {
        Collections.sort(list);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n ; i++) {
            list.add(sc.nextInt());
        }

        sortlist(list);

        System.out.println("Sorted List: ");
        for(int i:list)
            System.out.println(i);
    }
}

