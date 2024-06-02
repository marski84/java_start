package Queue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Client> exampleQueue = new LinkedList<Client>();
        PriorityQueue<Client> priorityQueue = new PriorityQueue<>(new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                return Integer.compare(o1.hashCode(), o2.hashCode());
            }
        });

        exampleQueue.offer(new Client("grażynka", 10));
        exampleQueue.offer(new Client("kokoszko", 2));
        exampleQueue.offer(new Client("tyryryry",1));
        exampleQueue.offer(new Client("dumbo", 7));

        priorityQueue.offer(new Client("grażynka", 10));
        priorityQueue.offer(new Client("kokoszko", 2));
        priorityQueue.offer(new Client("tyryryry",1));
        priorityQueue.offer(new Client("dumbo", 7));

        System.out.println(priorityQueue);

//        System.out.println(exampleQueue.peek());
//        System.out.println(exampleQueue.poll());
//        System.out.println(exampleQueue.peek());
//
//        System.out.println(exampleQueue);
    }


}
