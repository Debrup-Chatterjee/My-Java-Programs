//import java.util.*;
class Alphabet
{
    public static void main(char c)
    {
        if((int)c==65||(int)c==97)
        {
            System.out.println("Current alphabet : "+ c);
            System.out.println("Preceding alphabet: NOT AVAILABLE");
            System.out.println("Succeeding alphabet: "+(char)(c+1));
        }
        else if((int)c==90||(int)c==122)
        {
            System.out.println("Current alphabet : "+ c);
            System.out.println("Preceding alphabet: "+(char)(c-1));
            System.out.println("Succeeding alphabet: NOT AVAILABLE");
        }
        else
        {
            System.out.println("Current alphabet : "+ c);
            System.out.println("Preceding alphabet: "+(char)(c-1));
            System.out.println("Succeeding alphabet: "+(char)(c+1));
        }
    }
}