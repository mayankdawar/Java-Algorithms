public class QueueOfStrings {
    private Node first,last;

    private class Node{
        String item;
        Node next;
    }

    public QueueOfStrings() {
        first = null;
        last = null;
    }

    void enqueue(String items){
        Node oldLast = last;

        last = new Node();
        last.item = items;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else {
            oldLast.next = last;
        }
    }
    String dequeue(){
        String item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        return item;
    }
    boolean isEmpty(){
        return first == null;
    }
    void print(){
        Node newNode = first;
        while (newNode != null){
            System.out.println(newNode.item);
            newNode = newNode.next;
        }

    }

}
