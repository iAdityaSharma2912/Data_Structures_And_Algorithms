package com.company.Matrix;

public class Multi_dimensional_array {
    public static void main(String[]args){
        // MUTLI-D ARRAY declared without giving the size
        int[][]arr = {
                {1,2,3},
                {4,5,6}
        };
//        int [2][3] arr1 = {  // Wrong method to declare an multi-dimensional array
//                {1,2,3},
//                {4,5,6}
//        };
//        int arr2 [2][3] = {  // Wrong method to declare an multi-dimensional array
//                {1,2,3},
//                {4,5,6}
//        };
            int [][]arr3 =new int[3][3]; // defining the muti d array
//            arr3 ={{1,2,3,},{4,5,6} ,{7,8,9} }
            arr3[0][0]=0; // that's how i can intialize this

            int [][] arr4 = new int [3][]; // RIGHT the sizeof inindi array is not necessary / the column is not necessary

//            int [][] arr5 = new int [][3]; //WRONG as the row must be defined always

//        JAGGED ARRAY -> the columns aren't same and the columns are user specified

        for(int i = 0 ; i<arr4.length;i++){
            arr4[i]=new int[i+1];
            for (int j = 0; j<arr4[i].length;j++){
                arr4[i][j]=i;
                System.out.println(arr4[i][j]+"");
            }
            System.out.println();
        }


    }
}
