package LinearAndBinarySearch;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={1,5,10,20,56,89,74};
        int target=859;
        Find(a,target);
    }
    public static void Find(int a[],int target){
        for (int i=0;i<a.length;i++){
            if (i==a.length-1){
                System.out.println("Item is not found");
            }
            else if (a[i]==target){
                System.out.println(i);
                break;
            }
            else {
                continue;
            }
        }
    }
}
