package com.company.Arrays_Me;

public class Frequency_of_numbers {
    public static void main(String []args){
        int arr []= {10,20,30,30,30,40,50,50};

//        output = 10 ->1 , 20 -> 1 , 30->3 , 40 -> 1 ,50->2
    }
    static void m1(int[]arr){
        int frequency = 1 ;

        for (int i = 1 ; i <arr.length ; i++){
            if( arr[i-1] == arr[i]){
                frequency++;

            }

        }
    }
}
