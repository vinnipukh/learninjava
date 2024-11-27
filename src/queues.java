import java.util.LinkedList;
import java.util.Queue;

public class queues {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>(); {

            queue.offer("Karen");
            queue.offer("Chad");
            queue.offer("Steve");
            queue.offer("John");



            System.out.println(queue.contains("John"));

        }

    }
}
