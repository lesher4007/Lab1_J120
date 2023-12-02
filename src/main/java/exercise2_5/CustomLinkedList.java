package exercise2;

import java.util.Iterator;

public class CustomLinkedList<Y> implements CustomList<Y>{
    private Node head;
    private Node tail;

    @Override
    public void add(Y data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null){
            head = newNode;
        }else {
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            tail=newNode;
        }
    }

    @Override
    public void print() {
        System.out.println(this);
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
    public void forEachTo(Y data){
        Iterator<Y> iter = this.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
            if(iter.next()==data){
                break;
            }
        }
    }
    public void forEachAfter(Y data){
        Iterator<Y> iter = this.iterator();
        int var = 0;
        while (iter.hasNext()){
            iter.next();
            if(iter.next()==data){
                System.out.println(iter.next());
                var++;
                break;
            }
        }
        if(var == 1){
            while (iter.hasNext()){
            System.out.println(iter.next());
            }
        }
    }

    private class Node{
        Y data;
        Node next;

        public Node(Y data) {
            this.data = data;
            next = null;
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
            head = head.next;
            return var;
        }
        return null;
    }

    public Y getTailAndDelete() {
        if (head!=null) {
            Y var = getTail();
            Node currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            tail = currentNode;
            currentNode.next = null;
            return var;
        }
        return null;
    }

    public void addHead(Y data){
        Node newNode = new Node(data);
        newNode.next= head;
        head=newNode;
    }

    public void find(Y data){
        if (head==null) return;
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
    public void replaceAll(Y data){
        Node currentNode = head;
        head.data = data;

        while (currentNode.next != null){
            currentNode = currentNode.next;
            currentNode.data = data;
        }
    }


    public void remove(Y data) {
        Node currentNode = head;
        Node previousNode = null;
        if (head != null) {
            while (currentNode != null) {

            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            } else {
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
    }
    }

}
