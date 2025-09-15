import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedList1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list1=new LinkedList<>();
        System.out.println("Enter 5 sorted numbers for list1: ");
        for(int i=0;i<5;i++){
            list1.add(sc.nextInt());
        }
        LinkedList<Integer> list2=new LinkedList<>();
        System.out.println("Enter 5 sorted numbers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(sc.nextInt());
        }
        System.out.println("List 1: "+list1);
        System.out.println("List 2: "+list2);
        LinkedList<Integer> merged=new LinkedList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        Collections.sort(merged);
        System.out.println("Sorted List: "+merged);
    }
}
