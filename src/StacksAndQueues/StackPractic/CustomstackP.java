package StacksAndQueues.StackPractic;

import java.util.Arrays;

public class CustomstackP {
protected int[] data;
private static final int DEFAULT_SIZE=10;
int ptr=-1;
public CustomstackP(){
    this(DEFAULT_SIZE);
}
public CustomstackP(int size){
    this.data=new int[size];
}
public boolean isFull() {
    return ptr == data.length - 1;
}
public boolean isEmpty(){
    return ptr==-1;
}
public boolean push(int item){
    if (isFull()){
        System.out.println("This is Full");
    }
    ptr++;
    data[ptr]=item;
    return true;
}
public int pop(){
    if (isEmpty()){
        System.out.println("This is empty ");
    }
    int removed=data[ptr];
    ptr--;
    return removed;
}

public void display(){
    System.out.println(Arrays.toString(data));
}

    public static void main(String[] args) {
        CustomstackP list=new CustomstackP(5);
        list.push(30);
        list.push(80);
        list.push(3);
        list.push(36);
        list.push(39);

        System.out.println( list.pop());
        list.display();

    }
}

