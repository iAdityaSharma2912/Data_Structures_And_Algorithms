package com.company.Sorting;
import java.util.Arrays;

public class Selection_sort {
    public static void main(String[]arg){
        int []arr = {12,52,36,95,63 ,1};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void select(int[]arr){
        for (int i = 0 ; i<arr.length-1 ; i++){
            for(int j = i+1; j<arr.length ;j++ ){
                int min = i;
                if(arr[j]<arr[i]){
                    min = j;
                }
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i] = temp;

            }
        }
    }
}
