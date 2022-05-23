package com.company.Matrix;

public class Passing_mutliarray {
    public static void main(String[]args){
        int[][]arr = {{1,2,3},{4,5,6}};
        print_2d(arr);
    }
    static void print_2d(int[][]arr2){
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j<arr2[i].length;j++){
                System.out.println(arr2[i][j]);
            }
        }
    }
}
