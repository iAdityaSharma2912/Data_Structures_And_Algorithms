package com.company.Stringss;

public class Orderwise_frequecy {
    public static void main(String[]arg){
        String letter = "hahahahageeks";
        int [] count = new int [26];

        for(int i =0 ; i<letter.length(); i++ ){
            count[letter.charAt(i)-'a'] = count[letter.charAt(i)-'a'] +1 ;
//            System.out.println(letter.charAt(i)-'a');
        }
        for(int i =0 ;i<26 ; i++){
//            System.out.println(letter.charAt(i)-'a' + "have frequency" + count[i]);
            if(count[i]>0) {
                System.out.println((char) ('a' + i) + " have " + count[i] + " frequency ");
            }
        }
    }

}
