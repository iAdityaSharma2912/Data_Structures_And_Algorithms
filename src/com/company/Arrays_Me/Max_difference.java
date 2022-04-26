package com.company.Arrays_Me;

public class Max_difference {
    public static void main(String[]args){
        int arr[] = {2,3,10,6,4,8,1};
        // output = 560
//        System.out.println(m1(arr));
        System.out.println(m2(arr));

    }
    static int m1(int[]arr){
        int ans = 0;
        for(int i = 0 ;i <arr.length ;i++){
            for(int j = i+1 ; j<arr.length ;j++){
                if(ans<arr[j]-arr[i]){
                    ans = arr[j]-arr[i];
                }
            }
        }
        return ans;
    }

    static int m2(int[]arr){
        int max_ans = arr[1]-arr[0];
        int min_val = arr[0];
        for(int i =1 ;i<arr.length ;i++){
            if((arr[i]-min_val)>max_ans){
                max_ans = arr[i]-min_val;
            }
            if(arr[i]<min_val){
                min_val = arr[i];
            }
//        max_ans = Math.max(arr[i]-min_val , max_ans);
//        min_val = Math.min(arr[i] , min_val);
        }

        return max_ans;
    }
}
