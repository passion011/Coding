package StacksAndQueues.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Builtin {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(34);
        stack.push(4);
        stack.push(24);
        stack.push(94);
        stack.push(84);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue=new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(10);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
