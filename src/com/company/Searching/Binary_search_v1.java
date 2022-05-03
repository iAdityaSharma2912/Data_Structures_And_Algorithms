package com.company.Searching;

public class Binary_search_v1 {
    // Iterative approach

    public static void main(String[]arg){

        int [] arr = { 10,20,30,40,50,60};

        System.out.println(bin_iter(arr , 20));

    }
    static int bin_iter(int[]arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target ){
                return mid;
            }
            else if (arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return  -1;
    }
}
