package com.company.Arrays_Me;

public class Trapping_of_water {
    public static void main(String[]args){
        int[] arr = {3,0,1,2,5};
        System.out.println(m1(arr));

    }
    static int m1(int[]arr){
        int water = 0;
        for(int i = 1 ; i<arr.length-1 ;i++){
            int lmax= arr[i];
            for(int j = 0 ; j<i;j++){
                if(lmax<arr[j]){
                    lmax= arr[j];
                }
            }
            int rmax = arr[i];
            for(int k = i+1 ; k<arr.length-1 ;k++ ){
                if(rmax <arr[k]){
                    rmax = arr[k];
                }
            }
            water =water+Math.min(lmax,rmax)-i;
        }
        return water;

    }
}
