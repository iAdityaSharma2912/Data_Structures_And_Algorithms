package com.company.Searching;

public class Binary_first_occur {
    public static void main(String[]arg){
        // Recursive approach
        int[]arr = {10,20,20,20,30,40,50};

        System.out.println(bin_occu(arr , 20 , 0 , 6));



    }
    static int bin_occu(int[]arr , int target , int start , int end ){
        int mid = (start+end)/2;
        if (start > end){
            return -1;
        }
        if(arr[mid] == target ){
            if (arr[mid]==arr[mid-1]){
                return bin_occu(arr , target , start , mid-1);
            }
            return mid;
        }
        else if(arr[mid]>target){
            return bin_occu(arr , target , start , mid-1);

        }
        else{
            return bin_occu(arr ,target , mid+1 , end);
        }
    }
}
