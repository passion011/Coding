package ArrayHighLevelQuestionsAndAnswers.Arrays;

public class Q9intersection {
    public static void main(String[] args) {
        int a[]={1,2,2,3,3,4,5,6};
        int b[]={2,3,3,5,6,6,7};
        int Temp[]=new int[10];
        int i=0;
        int j=0;
        intersection1(a,b,i,j,Temp);
    }
    static int k=0;
    public static void intersection1(int a[],int b[],int i,int j,int Temp[]){
     if (Temp[k]!=a[i]){
         if (j==b.length-1){
             intersection1(a, b, ++i, j=0, Temp);
         }
         if (a[i]==b[j]){
             Temp[k]=a[i];
             intersection1(a, b, ++i, j,Temp);
         }else {
             intersection1(a, b, i, ++j,Temp);
         }
     }else{
        intersection1(a, b, ++i, j=0, Temp);
     }
    }
}
