package LinkedList.LinkedListPractic;

public class RemoveDuplicates {
    private Node head;
    private Node tail;
    private int size;
    public RemoveDuplicates(){
        size++;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node (int value,Node next){
            this.value=value;
            this.next=next;
        }

    }
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }


    public void removeDuplicates(){
        Node temp=head;
        while (temp.next!=null){
            if (temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;
            }else {
                temp=temp.next;
            }
        }
    }

    public void diaplay(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }

    public static void main(String[] args) {

    }
}
