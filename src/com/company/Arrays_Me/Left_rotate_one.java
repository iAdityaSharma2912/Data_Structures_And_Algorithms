package com.company.Arrays_Me;

public class Left_rotate_one {
    public static void main (String[]args){
        int [] arr ={1,2,3,4,5};
        rotate(arr);
        print_arr(arr);
    }
    static void rotate (int[]arr){
        int temp = arr[0];
        for (int i = 1 ;i <arr.length ; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]= temp;

    }

    static void print_arr(int[]arr){
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }

}
