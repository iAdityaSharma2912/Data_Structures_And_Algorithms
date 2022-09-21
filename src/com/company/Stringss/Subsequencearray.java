package com.company.Stringss;

public class Subsequencearray {
    public static void main(String[]args){
        String s1 = "jaishreeram";
        String s2 = "jsr";
        int i = 0 ;
        int j = 0;
        while( i < s2.length()){
            while(j<s2.length()){
                if(s2.charAt(i)==s1.charAt(j)){
                    i++;
                    j++;
                }
            }



            }


    }
}
