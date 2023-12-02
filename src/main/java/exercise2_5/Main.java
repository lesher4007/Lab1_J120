package exercise2_5;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        DoublyLinkedList<Integer> list2 = new DoublyLinkedList<>();

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
        System.out.println("----------------------------------------------");

        list2.add(17);
        list2.add(18);
        list2.add(35);
        list2.add(54);
        list2.add(55);
        list2.add(62);
        list2.add(64);
        list2.print();
        System.out.println();
        list2.forEachAfter(17);

        list2.print();



}
}
