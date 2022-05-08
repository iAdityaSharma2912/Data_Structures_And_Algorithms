package com.company.Sorting;

public class Bubble_sorting {
    public static void main(String[]arg){
        int[]arr = {13,6,23,2,36,553,663};
        bubble(arr);
        print_array(arr);


    }
    static void bubble(int[] arr){
        for (int i = 0 ; i<arr.length-1 ; i++){
            for(int j =0 ;j<arr.length-1-i ; j++ ){
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void print_array(int []arr){
        for (int i =0 ; i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
