package ExPackageJan;

public class Buffered {

}

class LinkedList {

    private static class Link {
        private int data;
        public Link previous;
        public Link next;

        public Link(int value) {
            previous = null;
            this.data = value;
            next = null;
        }

        public Link(Link previous, int value, Link next) {
            this.previous = previous;
            this.data = value;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

    }

    private Link head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }


    public int getSize() {
        return size;
    }

    public void addFront(int value) {
        if (head == null) {
            head = new Link(null, value, null);
        } else {
            Link newLink = new Link(null, value, head);
            head.previous = newLink;
            head = newLink;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void print() {
        Link current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
    }

    public void addBack(int value) {
        if (head == null) {
            head = new Link(null, value, null);
        }
        Link current = head;
        while (current.next != null) {
            current = current.next;
        }
        Link newLink = new Link(current, value, null);
        current.next = newLink;
        size++;
    }

    public void removeFront(){
        if(head == null) return;
        head = head.next;
        head.previous = null;
        size--;
    }
    public void removeBack() {
        if (head == null) return;
        if (head.next != null){
            head = null;
            size--;
            return;
        }
        Link current = head;
        if(current.next.next != null){
            current = current.next;
            current.next = null;
            size--;
        }
    }
    public void insertAt(int data, int index){
        if(head == null) return;

    }
    public void removeFrom(int data){

    }

    public static void main(String[] args) {
        LinkedList myLL = new LinkedList();

    }

}
