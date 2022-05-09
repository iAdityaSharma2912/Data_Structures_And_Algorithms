package com.company.Sorting;
import java.util.Arrays;
public class Instertional_sort {
    public static void main(String[]arg){
        int []arr ={20,5,40,60,10,30};
        sortme(arr);
         System.out.println(Arrays.toString(arr));
    }
    static void sortme(int[]arr){
        for (int i = 1 ; i<arr.length ; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j] ){
               arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }
    static void swap( int[]arr, int a , int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
