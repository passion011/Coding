package LinkedList.LinkedListPractic;

public class isHappy {
    public boolean ishappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow != fast);

        if (slow==1){
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
    private int findSquare(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans += rem%10;
            number /=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        isHappy obj=new isHappy();
        obj.ishappy(19);
    }
}
