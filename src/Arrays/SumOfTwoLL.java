package Arrays;


public class SumOfTwoLL {
    private Node head;
    private Node tail;
    private int size;
    public SumOfTwoLL(){
        size+=1;
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
    public void diaplay(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }
public void CollectionOFOddandEven(SumOfTwoLL list,SumOfTwoLL LL){
        Node odd=head;
        while (odd !=null){
            LL.insertFirst(odd.value);
            odd=odd.next.next;
        }
        LL.diaplay();
}
    public void SumofTwoLinkedlists(SumOfTwoLL list1, SumOfTwoLL list2,SumOfTwoLL list3){
        Node head1 = list1.head;
        Node head2 = list2.head;
        int carry = 0;
        while(head1!=null&&head2!=null){
            int digit=head1.value+head2.value+carry;
            int num=digit%10;
            list3.insertFirst(num);
            carry=digit/10;
            digit=0;
            head1=head1.next;
            head2=head2.next;
        }
    }
    private class Node{
        private int value;
        private Node next;
        private int i=0;
        public Node (int value, Node next, int i){
            this.value=value;
            this.next=next;
            this.i=i;
        }
        public Node(int value){
            this.value=value;
        }
        public Node (int value, Node next){
            this.value=value;
            this.next=next;
        }

    }
    public static void main(String[] args) {
        SumOfTwoLL list1=new SumOfTwoLL();
        list1.insertFirst(7);
        list1.insertFirst(8);
        list1.insertFirst(3);
//        list1.diaplay();

        SumOfTwoLL list2=new SumOfTwoLL();
        list2.insertFirst(6);
        list2.insertFirst(4);
        list2.insertFirst(2);
//        list2.diaplay();

        SumOfTwoLL list3=new SumOfTwoLL();
//        list3.SumofTwoLinkedlists(list1,list2,list3);
        SumOfTwoLL list=new SumOfTwoLL();
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(1);
        list.diaplay();

        SumOfTwoLL LL=new SumOfTwoLL();
        LL.CollectionOFOddandEven(list,LL);

    }
}
