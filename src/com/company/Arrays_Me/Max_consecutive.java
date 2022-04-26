package com.company.Arrays_Me;

public class Max_consecutive {
    public static void main(String []args){
        int []arr = {0,1,1,1,0,1,1,1,1,1};
        System.out.println( m1(arr));

    }
    static int m1(int[]arr){
        int count = 0;
        int occur = 0;
        for (int i = 0 ; i <arr.length ;i++ ){
            if(arr[i]==0){
                count = 0;
            }
            else {
                count ++;
                occur = Math.max(count , occur);
            }

        }
        return occur;
    }

}
