package StacksAndQueues.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data=new int[size];
    }
    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot pop from empty stack!!");
        }
//        int removed=data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }
    public int peek() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot peek from empty stack!!");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr==data.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

    public static void main(String [] args) throws StackException {
        DynamicStack stack=new DynamicStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(3);
        stack.push(9);
        stack.push(44);
        stack.push(46);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
