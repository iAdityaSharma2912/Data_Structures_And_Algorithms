package com.company.Arrays_Me;

public class Majority_element {
    public static void main(String[]agr){
        int[] arr= {8,7,6,7,6,6,6,6};
        System.out.println(m1(arr));

    }
    static int m1(int[]arr){
        int count = 0;
        int ans = 0;
        for(int i = 0 ; i<arr.length ; i++){
            for (int j =0;j< arr.length ; j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            if(count>ans){
                ans= count;
            }
            count=0;
        }
        if(ans>(arr.length)/2)
            return ans;

    return -1;
    }
}
