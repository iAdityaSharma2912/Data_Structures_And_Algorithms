package com.company.Stringss;

public class palindrome {
    public static void main (String[] args){
        String h = "framtmarf";
        boolean flag = true;
        for(int i = 0 ; i < h.length()/2 ; i++){
            if(h.charAt(i)!=h.charAt(h.length()-1-i)){
        flag= false;
        break;
            }
        }
        if(!flag){
            System.out.println("not palindrome");
        }
        else {
            System.out.println("is palindrome");
        }

     }
}
