import java.util.LinkedList;

public class linkedlists {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.add(4,"E");

        System.out.print(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);

    }
}
