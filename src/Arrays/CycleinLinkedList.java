//package Arrays;
//public class Solution {
//    public int hasCycle(ListNode head) {
//        ListNode fast=head;
//        ListNode slow=head;
//
//        while(fast !=null &&fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if(fast==slow){
//                Node temp=slow;
//                int length=0;
//                do{
//                    temp=temp.next;
//                    length++;
//                }while (temp!=slow);
//                return length
//
//            }
//        }
//        return 0;
//    }
//}
