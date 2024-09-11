package StacksAndQueues.StacksandQueuesQuestions;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

//        stack.push(6);
//        stack.push(34);
//        stack.push(16);
//        stack.push(32);
//        stack.push(14);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }

}

class QueueUsingStack1 {
    private Stack<Integer>first;
    private Stack<Integer>second;

    public QueueUsingStack1(){
        first=new Stack<>();
        second=new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public int peek(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}
