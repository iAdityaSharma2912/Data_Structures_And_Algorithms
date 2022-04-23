package com.company.Arrays_Me;

public class largest_element {
public static void main(String [] args){
    int [] myarray = {12,12,3,66,22,45,6,9952,56232,123};
    System.out.println(largest(myarray));

}

static int largest(int[] arr ){
    int ans = arr[0];
    for(int i =1 ; i< arr.length ; i++){
        if(arr[i] > ans)
            ans = arr[i];
    }

    return ans;
}
}
