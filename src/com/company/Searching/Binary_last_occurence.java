package com.company.Searching;

public class Binary_last_occurence {
    public static void main(String[]arg){
        int []arr = {5, 10, 10, 10, 10, 20, 20};
//        System.out.println(last_occ(arr , 10 , 0 , 6));
        System.out.println(last_occ_iteration(arr , 10 ));

    }
    //Recursive Approach

    static int last_occ(int[]arr ,int target , int start , int end){
        int mid  = (start + end)/2;
        if (start>end)return -1;

        if (arr[mid]== target ){
            if(arr[mid]==arr[mid+1]){
                return last_occ(arr , target , mid+1 , end);
            }
            return mid;
        }

        else if(arr[mid]>target){
            return last_occ(arr , target , start , mid-1);
        }

        else {
            return last_occ(arr , target , mid+1 , start);
        }
    }

    // Iterative approach
    static int last_occ_iteration(int []arr , int target){
        int start = 0;
        int end = arr.length;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                if(arr[mid]==arr[mid+1]){
                    start = mid+1;
                }
                else {
                    return mid;
                }


            }
            else if (arr[mid]>target){
                end = mid-1;
            }
            else {
                start = mid + 1;}

        }
         return -1;
    }
}
