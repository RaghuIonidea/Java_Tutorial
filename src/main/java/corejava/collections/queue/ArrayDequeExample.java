package corejava.collections.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.offer("Banana");
        System.out.println(ad);

        ad.offerFirst("Apple");
        System.out.println(ad);

        ad.offerLast("Avocado");
        System.out.println(ad);

        ad.offerLast("Grapes");
        System.out.println(ad);

        ad.offer("Mango");
        ad.offer("Oranges");
        System.out.println(ad);

        ad.offerFirst("JackFruit");
        System.out.println(ad);

        ad.offerLast("Papayya");
        System.out.println(ad);
    }
}
