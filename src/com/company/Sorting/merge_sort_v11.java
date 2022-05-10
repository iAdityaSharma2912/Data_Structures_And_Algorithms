package com.company.Sorting;
import java.util.Arrays;
public class merge_sort_v11 {
    public static void main(String[]arg){
        int[]arr = {5,15,25,35,1,10,20,30};
        System.out.println(Arrays.toString(appart_the_merge(arr ,0 , 3 ,7 )));
    }
    static int[] appart_the_merge(int[]arr , int low , int mid , int high){
        int [] left = new int[mid-low+1];
        int[] right = new int [(high-mid)];
//        System.out.println(left.length);
//        System.out.println(right.length);
        for (int i = 0 ; i<left.length ; i++){
            left[i]=arr[low+i];
//            System.out.print(left[i] + " ");
        }
        for (int i = 0;i<right.length ;i++){
            right[i]=arr[mid+1+i];
//            System.out.print(right[i] + " ");

        }
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else {
                arr[k]=right[j];
            j++;
            k++;
            }
        }
        while (i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }


        return arr;
    }
}
