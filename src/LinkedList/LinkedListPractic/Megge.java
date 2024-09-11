package LinkedList.LinkedListPractic;
public class Megge {
    private Node head;
    private Node tail;
    private int size;
    public Megge(){
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

    public static Megge Merge(Megge first,Megge second){
        Node f=first.head;
        Node s=second.head;

        Megge ans=new Megge();
        while (f.next!=null&&s.next!=null){
            if (f.value<s.value){
                ans.insertFirst(f.value);
                f=f.next;
            }
            else {
                ans.insertFirst(s.value);
                s=s.next;
            }
        }
         while(f!=null){
             ans.insertFirst(f.value);
             f=f.next;
         }
        while(s!=null){
            ans.insertFirst(s.value);
            s=s.next;
        }
        return ans;
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
        Megge first=new Megge();
        first.insertFirst(4);
        first.insertFirst(2);
        first.insertFirst(1);
        Megge second=new Megge();
        second.insertFirst(4);
        second.insertFirst(3);
        second.insertFirst(1);

        first.diaplay();
        second.diaplay();


    }
}

