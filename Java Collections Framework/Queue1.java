import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("nodejs");
        queue.offer("Java");
        queue.offer("C#");
        queue.offer("Python");
        System.out.println("Queue: "+queue);
        System.out.println("Polled: "+queue.poll());
        System.out.println("Peek: "+queue.peek());
        System.out.println("Queue after poll: "+queue);
    }
}
