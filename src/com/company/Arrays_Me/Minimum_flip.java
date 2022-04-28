package com.company.Arrays_Me;

public class Minimum_flip {
    public static void main(String[]arg){
        int arr []= {1, 1, 0, 0, 0, 1,0};
       m1(arr);
    }
    static void m1(int[]arr){
        int first = arr[0];
        for(int i = 1 ; i<arr.length ; i++ ){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=first){
                    System.out.print(" "+i+" to ");
                }
                else {
                    System.out.print(i-1);
                }

            }
        }
        if(arr[arr.length-1]!=first){
            System.out.println(arr.length-1);
        }
    }

}
