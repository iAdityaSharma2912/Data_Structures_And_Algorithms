package com.company.Arrays_Me;

public class Max_sum_of_conse_subarray {
    public static void main(String[]args){
        int[]arr = {-5,1,-2,3,-1,2,-2};
        System.out.println(m1(arr));


    }
    static int m1(int[]arr){ //naive solution is done but confused in the 0{n} approach
        int sum = 0;
        int ans = 0;
        for(int i = 0 ; i<arr.length ;i++){
            for (int j = i ;j<arr.length ;j++){
                sum = sum+arr[j];
                if(sum>ans){
                    ans = sum;
                }
            }
            sum = 0;

        }
        return ans;
    }
}
