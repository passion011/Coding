package LinkedList.LinkedListPractic;

public class LL1 {
    private Node head;
    private Node tail;
    private int size;
    private LL1(){
        size++;
    }

    //Deletion
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if (size==1){
            head=null;
        }
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        Node temp=head;
        for (int i=0;i<size-3;i++){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        return tail.value;
    }

    //insertion
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int value){
        if (tail==null){
            insertFirst(value);
            return;
        }
        Node node =new Node(value);
        tail.next=node;
        tail=node;
        node.next=null;
        size+=1;

    }

//    public void insert(int value,int index){
//        if (index==0){
//            insertFirst(value);
//        }
//        if (index==size){
//            insertLast(value);
//        }
//        Node temp=head;
//        for (int i=1;i<index;i++){
//            temp=temp.next;
//        }
//        Node node=new Node(value);
//       Node TempNode=temp.next;
//        temp.next=node;
//        node.next=TempNode;
//        size++;
//    }

    public void insert(int value,int index,int i){
        Node temp=head;
        if (i==1){
            temp=temp.next;
            System.out.println(temp.value);
            return;
        }
    if (i<=index){
        temp=temp.next;
        insert(value, index, --i);
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
     private class Node{
        private int value;
        private Node next;
        private int i=0;
        public Node (int value,Node next,int i){
            this.value=value;
            this.next=next;
            this.i=i;
        }
        public Node(int value){
            this.value=value;
        }
        public Node (int value,Node next){
            this.value=value;
            this.next=next;
        }

    }


    public static void main(String[] args) {
        LL1 list=new LL1();
        list.insertFirst(3);
        list.insertFirst(45);
        list.insertFirst(89);
        list.insertFirst(8);
//        list.insertFirst(35);
        list.insert(17,3,3);
//        System.out.println(list.deleteLast());
        list.diaplay();
    }
}