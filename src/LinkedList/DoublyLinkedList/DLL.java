package LinkedList.DoublyLinkedList;

import LinkedList.SingliLinkedList.LL;

public class DLL {
    private Node head;

    //Insert
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.previous=null;
        if (head !=null){
            head.previous=node;
        }
        head=node;

    }

    //Insert At last
    public void insertLast(int val){
        Node node = new Node(val);
        Node last=head;
        node.next=null;

        if (head == null){
            node.previous=null;
            head=node;
            return;
        }
        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.previous=last;


    }


    //Insert after any index
    // Find the element
    public Node find(int value){
        Node node=head;
        while (node != null){
            if (node.value==value){
                return node;
            }
            node =node.next;
        }
        return node;
    }

    public void insert(int after,int val){
        Node p=find(after);
        if (p==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.previous=p;
        if (node.next!=null){
            node.next.previous=node;
        }

    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.print("End");
    }
//    public void displayReverse(){
//        Node temp=head;
//        Node last=null;
//        while (temp!=null){
////            System.out.print(temp.value + "->");
//            last=temp;
//            temp=temp.next;
//        }
////        System.out.print("End");
//        while (last!=null){
//            System.out.print(last.value + "->");
//            last=last.previous;
//        }
//        System.out.print("End");
//
//    }
    private class Node{
        private int value;
        private Node next;
        private Node previous;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

    }

    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertFirst(6);
        list.insertFirst(45);
        list.insertFirst(5);
        list.insertFirst(12);
        list.insertLast(99);
        list.insert(5,65);
        list.display();

    }
}
