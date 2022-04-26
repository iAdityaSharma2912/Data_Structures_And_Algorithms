package com.company.Arrays_Me;

public class Frequency_in_sorted {
    public static void main(String []arg){
        int []arr = {140,50,50,50,50 };
        // output 10 - 3, 25 -1 ,30 - 2
        freq(arr);
    }
    static void freq(int []arr){
        int count = 1;
        int i = 1;
        while(i<arr.length){
            while (i< arr.length && arr[i-1]==arr[i] ){
                count++;
                i++;
            }
            System.out.println(arr[i-1]+ "  "+count );
            i++;
            count=1;
        }
        if(arr.length == 1){
            System.out.println(arr[i-1]+ "  "+count ); // gonna handle the array of 1 length case

        }

    }
    }
