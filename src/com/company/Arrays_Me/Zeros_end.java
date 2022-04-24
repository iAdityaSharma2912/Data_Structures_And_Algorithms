package com.company.Arrays_Me;

public class Zeros_end {
    public static void main (String[]args){
        int[]arr = {1,2,0,3,4,0,5,0,6};
        end_zero(arr);
        printarr(arr);

    }
    static void end_zero (int []arr){
        int count = 0;
        for(int i = 0;i <arr.length ; i++){

            if(arr[i]!=0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i]= temp;
                count++;
            }

        }

    }
    static void printarr (int []arr){
        for(int i = 0; i < arr.length ;i++){
            System.out.print(arr[i] +" ");
        }
    }

}
