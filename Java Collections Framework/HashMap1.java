import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.next();

        Map<Character,Integer> freq=new HashMap<>();
        for(char ch: str.toCharArray()) // converting the string to char array since foreach loop only works on iterables and string is not iterable
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(char ch:str.toCharArray())
        {
            if(freq.get(ch) == 1){
                System.out.println("First non repeating character= "+ch);
                return;
            }
        }
        System.out.println("There is no unique character found");
    }
}
