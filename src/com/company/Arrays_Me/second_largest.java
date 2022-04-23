package com.company.Arrays_Me;

public class second_largest {
    public static void main(String[] args) {
        int [] myarray = {0,1,2,3,4,5,6,7,80,9};
        System.out.println(second_large(myarray));

    }
    static int second_large(int [] arr){
        int largest = 0;
        int sec = -1;
        for (int i = 1 ; i < arr.length ; i++ ){
            if(arr[i]>arr[largest]){
                sec = largest;
                largest = i;

            }
            else if (arr[i]!=arr[largest]){
                if(sec == -1 || arr[i]>arr[sec]){    // only one true if condition is checked if true other one is not checked . can not change the order of the or else gonna show error.
                    sec = i;
                }

            }

        }
        return sec;
    }
}
