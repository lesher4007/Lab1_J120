package exercise2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();


        list.add(1);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(6);
        list.print();

        list.forEachAfter(1);
        System.out.println();
        list.forEachTo(3);
}
}
