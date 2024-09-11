package Strings;

public class anagramornot {
    public static void main(String[] args) {
        String str1="sos";
        String str2="Fun";
        int str1count=0;
        int str2count=0;

        for (int i=0;i<str1.length();i++){
            str1count=str1count+1;

        }
        for (int j=0;j<str2.length();j++){
            str2count=str2count+1;
        }
        if (str1count==str2count){
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }
    }
}
