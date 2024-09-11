package Recursion;

public class chackStringIsPalindrom {
    public static void main(String[] args) {
        String str="sos";

        int i=str.length()-1;
        String p="";
        palindrom(p,str,i);
    }
    public static String palindrom(String p,String str,int i){
      return palindrom(p, str, i);
    }
}
