
import java.util.*;

class UniqueFromListUsingBitwise {

    public static void main(String[] args) {
        int n, x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers into the list: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            x = x ^ i;
        }
        if (x != 0) {
            System.out.println("The  unique number is : " + x);
        } else {
            System.out.println("No unique number present  in the list");
        }
    }
}
