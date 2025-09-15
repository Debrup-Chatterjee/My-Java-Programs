import java.util.*;

public class LeftOverElementsInARange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer str=new StringTokenizer(sc.nextLine());
        int start=Integer.parseInt(str.nextToken());
        int end=Integer.parseInt(str.nextToken());
        int n=Integer.parseInt(str.nextToken());
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str.nextToken());
        }

        ArrayList<Integer> range=new ArrayList<>();
        for(int i=start;i<=end;i++){
            range.add(i);
        }

        for(int i=0;i<n;i++){
            range.remove((Integer) arr[i]);
        }

        ArrayList<String> output=new ArrayList<>();
        Iterator<Integer> it=range.iterator();
        int x=it.next();
        int y=x;
        while(it.hasNext()){
            int ele=it.next();
            if (ele == y + 1) {
                y = ele;
            }
            else {
                int a[] = (x == y) ? new int[]{x} : new int[]{x, y};
                output.add(Arrays.toString(a));
                x = ele;
                y = ele;
            }
        }
        int a[] = (x == y) ? new int[]{x} : new int[]{x, y};
        output.add(Arrays.toString(a));
        System.out.println(output);
    }
}
