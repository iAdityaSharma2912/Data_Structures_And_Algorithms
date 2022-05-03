package com.company.Searching;

public class Recursive_binary_v2 {
    public static void main(String[]arg){
        int[]arr = {10,20,30,40,50};
        System.out.println(bin_rec(arr , 10 ,  0 , 4));

    }
    static int bin_rec(int[]arr , int target , int start , int end){
        int mid=( start + end )/2;
        if (start>end){
            return -1 ;
        }
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
           return bin_rec(arr , target , start , mid-1);
        }
        else {
            return bin_rec(arr , target , mid + 1 , end);
        }

    }
}
