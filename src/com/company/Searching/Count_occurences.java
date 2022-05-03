package com.company.Searching;

public class Count_occurences {
    public static void main(String[] args) {
        int []arr = {5, 10, 10, 10, 10, 20, 20};
        System.out.println(total_occ(arr));
    }
    static int total_occ(int[]arr){
        int end = 0;
        int last = arr.length-1;
        int first = bin_occu(arr , 10 , end ,last );
        if(first==-1){
            return 0;
        }else {
            return (last_occ_iteration(arr , 10)-first+1);
        }
    }

    //first
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

    //last
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
