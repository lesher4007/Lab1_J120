package exercise2;

import java.util.Iterator;

public class DoublyLinkedList<Y> implements CustomList<Y> {
    private Node head;
    private Node tail;

    @Override
    public void add(Y data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    public void reversPrint() {
        System.out.println(this.reverstoString());
    }

    @Override
    public String toString() {
        Node currentNode = head;
        StringBuilder sb = new StringBuilder("[");
        while (currentNode != null) {
            sb.append(currentNode.data);
            sb.append(currentNode.next != null ? ", " : "");
            currentNode = currentNode.next;
        }
        sb.append("]");
        return sb.toString();
    }
    public String reverstoString() {
        Node currentNode = tail;
        StringBuilder sb = new StringBuilder("[");
        while (currentNode != null) {
            sb.append(currentNode.data);
            sb.append(currentNode.prev != null ? ", " : "");
            currentNode = currentNode.prev;
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<Y> iterator() {
        return new MyIterator(head);
    }

    private class MyIterator implements Iterator{

        Node head;
        Node current;


        public MyIterator(Node head) {
            this.head = head;
        }

        @Override
        public boolean hasNext() {
            current = current==null ? head : current.next;
            return current!=null;
        }

        @Override
        public Y next() {
            return current!=null ? current.data : null;
        }
    }

    public class Node {
        private Y data;
        private Node next;
        private Node prev;

        public Node(Y data) {
            this.data = data;
            next = null;
            prev = null;

        }
    }

    public Y getHead() {
        if (head!=null) {
            return head.data;
        }
        return null;
    }

    public Y getTail() {
        if (head!=null) {
            return tail.data;
        }
        return null;
    }

    public Y getHeadAndDelete() {
        if (head!=null) {
            Y var = getHead();
            if (head.next == null) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return var;
        }
        return null;
    }

    public Y getTailAndDelete() {
        if (head!=null) {
            Y var = getTail();
            if (tail.prev == null) {
                head = tail = null;
            } else {
                tail.prev.next = null;
                tail = tail.prev;
            }
            return var;
        }
        return null;
    }

    public void addByIndex(Y data, int index){
        Node currentNode = head;
        int c = 0;
        Node newNode = new Node(data);

        if (index==0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            while (currentNode.next != null && c != index) {
                currentNode = currentNode.next;
                c++;
            }
            if (index>c){
                throw  new IllegalArgumentException();
            }
            currentNode.prev.next = newNode;
            newNode.prev = currentNode.prev;
            currentNode.prev = newNode;
            newNode.next = currentNode;
        }
   }

    public void addHead(Y data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }else {
            head.prev = newNode;
        }
        newNode.next= head;
        head=newNode;
    }

    public void find(Y data){
        Node currentNode = head;
        int count = 0;
        if (currentNode.data == data) count++;
        while (currentNode.next != null){
            currentNode = currentNode.next;
            if(currentNode.data == data){
                count++;
            }
        }
        System.out.println("Совпадение присутствует " + count + " раз(а)");
   }

    public void remove(Y data){
        if(head!=null) {
            Node currentNode = head;
            while (currentNode != null) {

                if (currentNode.data == data) {
                    if (currentNode == head) {
                        if(currentNode.next==null){
                            head = null;
                            tail = null;
                        }else {
                            currentNode.next.prev = null;
                            head = currentNode.next;
                        }
                    } else if (currentNode == tail) {
                        currentNode.prev.next = null;
                        tail = currentNode.prev;

                    } else {
                        currentNode.next.prev = currentNode.prev;
                        currentNode.prev.next = currentNode.next;
                    }
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void replaceAll(Y data){
        if(head == null){return;}
        Node currentNode = head;
        head.data = data;
        while (currentNode.next != null){
            currentNode = currentNode.next;
            currentNode.data = data;
        }
    }

    public void addArray(Y[] array){
        for (int i = 0; i < array.length; i++) {
            add(array[i]);
        }
    }

    public void addTailLinkedList(DoublyLinkedList list){
        if(head == null){return;}
        Node currentNode = list.head;
        while (currentNode != null) {
            add((Y) list.getHeadAndDelete());
            currentNode = currentNode.next;
        }
    }
    public void addLinkedList(DoublyLinkedList list){
        if(head == null){return;}
        Node currentNode = list.tail;
        while (currentNode != null) {
            addHead(currentNode.data);
            currentNode = currentNode.prev;
        }
        list.tail = list.head = null;
    }
}

