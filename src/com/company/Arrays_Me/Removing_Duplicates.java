package com.company.Arrays_Me;

public class Removing_Duplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2 , 3 , 3};
        System.out.println(duplicatesremoved(arr));


    }
    static int duplicatesremoved(int []arr){
      int ans=1;
        for (int i = 1; i< arr.length ; i++ ){
            if(arr[ans-1]!=arr[i]){
                arr[ans]=arr[i];
                ans++;

            }


        }
        return ans;
    }
}
