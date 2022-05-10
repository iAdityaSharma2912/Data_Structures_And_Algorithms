package com.company.Sorting;
import java.util.Arrays;

public class Merging_v10 {
    public static void main(String[]arg){
        int[]a = { 5,15,25,35}; //6
        int[]b = {0,10,20,30};//7
        int[]c= merge_sort_naive(a, b);
//        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(merg_then_sort(a,b)));

    }
    static int[] merge_sort_naive(int[]arr1 , int[]arr2 ){
        int []arr3 = new int [(arr1.length+ arr2.length)];
        for (int i = 0 ; i<arr1.length+arr2.length ;i++){
            if(i<=arr1.length-1){
                arr3[i]=arr1[i];
            }
            else{
                arr3[i]=arr2[(i-arr1.length)];
            }
        }
        Arrays.sort(arr3);
        return arr3;
    }

    static int[] merg_then_sort(int[]arr1 ,int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k =0;
        while(i!=arr1.length-1 && j!=arr2.length-1){
            if(arr1[i]>arr2[j]){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
            else {
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }

        return arr3;
    }
}
