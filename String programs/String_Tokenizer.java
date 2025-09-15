
import java.util.StringTokenizer;

public class String_Tokenizer {

    public static void main(String[] args) {
        int c = 0;
        StringTokenizer str = new StringTokenizer("Understanding ISC Computer Science");
        System.out.println("The different tokens by using String Tokenizer are:");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
            c = c + 1;
        }
        System.out.println("Number of tokens = " + c);
    }
}
