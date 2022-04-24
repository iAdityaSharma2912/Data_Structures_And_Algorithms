package com.company.Arrays_Me;

public class Left_rotate_by_d {                         // CONTAIN THREE METHODS
    public static void main (String[]args){
        int[] arr = {1,2,3,4,5};
        int[] output = {3,4,5,1,2};
        int d = 2;
        m1_left_by_d(arr , 2);
        print_arr(arr);
        m2(arr , 2);
        print_arr(arr);
        m3_best(arr , 2);
        print_arr(arr);
    }
    static void print_arr(int[]arr){
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }
    static void rotate_once(int []arr){
        int temp = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
             arr[i-1]= arr[i];
        }
        arr[arr.length-1]=temp;
    }
    static void m1_left_by_d(int [] arr , int d){
        // rotating the whole two times . This will make it d = 2
        for (int i = 1 ;i<=d ;i++){
            rotate_once(arr); // Uses the rotate_once as it will rotate the array as many time you want and will achieve the result of (d= n)
        }

    }
    static void m2(int []arr , int d){
        int temp[] =new int[d]; // declaring and allocating the array
        for (int i = 0 ;i <d ;i++){
            temp[i] = arr[i];
        }
        for(int i = d ; i < arr.length ; i++){
            arr[i-d]= arr[i];
        }
        for(int i = 0 ; i< d ; i++){
            arr[arr.length+i-d] = temp[i];
        }
    }
    static void reverse (int[] arr , int start , int end){
        while(start <end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
    static  void m3_best(int []arr ,int d){ // reversing approach
        reverse(arr , 0 ,d-1);
        reverse(arr , d ,arr.length-1);
        reverse(arr , 0 , arr.length-1);

    }
}
