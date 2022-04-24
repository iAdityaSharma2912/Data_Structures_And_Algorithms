package com.company.Arrays_Me;

public class Leader_in_array {
    public static void main(String[]args){

        int [] arr = {120,56, 35,4,8,9} ;
        // output = 120 ,  56 , 35 , 9
       // right side of each element is not having any number which is greater than the output
        m1(arr);
        System.out.println("");
        m2(arr);


    }
    //naive method
    static void m1(int[]arr ){
        for (int i =0;i<arr.length;i++){
            boolean leader = true;
            for (int j = i+1 ; j<arr.length ; j++ ){
                if(arr[i]<arr[j]){
                    leader = false;
                }
            }
            if (leader == true)
                System.out.print(arr[i]+" ");
        }
    }

  // effecient method
    // checking from the rightmost side of the array and having a comparison between the prev leader and the new

    static void m2(int []arr){
        int leader = arr[arr.length-1];
        System.out.print(leader+" ");
        for (int i = arr.length-2 ; i>=0 ; i--){
            if (arr[i]>leader){
                System.out.print(arr[i]+" ");
                leader = arr[i];
            }
        }
    }


}
