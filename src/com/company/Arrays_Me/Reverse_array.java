package com.company.Arrays_Me;

public class Reverse_array {
    public static void main (String[]args){
        int[]arr = {1,2,3,4,5,6,7};
        rev(arr);
        printarr(arr);

    }
    static void rev(int []arr ){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp ;
             low++;
             high--;
        }
    }
    static void printarr(int[]arr){
        for(int i = 0 ;i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
