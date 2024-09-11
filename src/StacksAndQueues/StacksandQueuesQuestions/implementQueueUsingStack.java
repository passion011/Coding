package StacksAndQueues.StacksandQueuesQuestions;

public class implementQueueUsingStack {
    protected int[] data;
    public static final int DEFAULT_SIZE=10;

    int end=0;
    public implementQueueUsingStack(){
        this(DEFAULT_SIZE);
    }
    public implementQueueUsingStack(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return end==data.length-1;
    }
    public boolean isEmpty(){
        return end<0;
    }

    public boolean insert(int value){
        if (isFull()){
            System.out.println("Cant insert");
        }
        data[end]=value;
        end=end+1;
        return true;
    }

//    public boolean deletion(){
//        if (isEmpty()){
//            System.out.println("It is empty");
//        }
//        int j=0;
//        int temp[]=new int[data.length-1];
//        for (int i=data.length-1;i<=0;i--){
//            data[i]=temp[j];
//            j=j+1;
//        }
//
//    }
}
