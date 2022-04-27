package com.company.Arrays_Me;

public class Largest_odd_even{
    public static void main(String[]arg){
        int[]arr = {7,10,13 ,20 ,21};
        System.out.println(m1(arr));
        System.out.println(m2(arr));


    }
    static int m1(int[]arr){
        int count = 1;
        int ans = 0;
        for(int i =0 ; i<arr.length;i ++){
            for(int j = i+1 ; j<arr.length ; j++){
                if((arr[j]%2==0 && arr[j-1]%2!=0)||(arr[j]%2!=0 && arr[j-1]%2==0)){
                    count++;
                    if(ans<count){
                        ans = count;
                    }
                }
                else {


                    break;

                }

            }
            count =0;

        }
return ans;
    }
    static int m2(int[]arr){
        int count = 1;
        int ans = 0;
        for(int j = 1 ; j<arr.length; j++ ){
            if((arr[j-1]%2==0 && arr[j]%2!=0)||(arr[j-1]%2!=0 && arr[j]%2==0)){
                count++;
                if(ans<count){
                    ans = count;
                }
            }
            else{
                count =1;

            }


        }
        return ans;
    }


    }