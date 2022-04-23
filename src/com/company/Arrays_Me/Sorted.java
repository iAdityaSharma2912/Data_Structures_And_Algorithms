package com.company.Arrays_Me;

public class Sorted {
    public static void main (String [] args){

        int [] arr = {1,2,3,4,5,6,7,8,9};
//        System.out.println(back(arr));
        System.out.println(front(arr));


    }
    static  boolean front (int [] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){  // forward jate huye mujhe lenght + 1 mai error atta too mai lenght-1 tk hi jaa raha hu
            if(arr[i]>arr[i+1]){
                return false;
            }

        }
        return true;
    }
   static boolean back (int [] arr){
        for(int i = 1 ; i < arr.length ; i++){ // back wala check krna hai aur last element mera lenght-1 pr hoga too koi dikkat nhi hogi just think
            if(arr[i]<arr[i-1]){
                return false;
            }

        }
        return true;
    }
}
