import java.util.*;
public class FrequencyOfElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of pockets: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements into the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int i:arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }

        System.out.println("The frequency of elements in the array are:");
        System.out.println(freq);
    }
}
