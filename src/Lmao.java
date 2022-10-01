public class Lmao {
    public static void main(String args[]){
        int[][]arr={
                {1,1,1,1,1},
                {0,1,1,1,0},
                {1,0,1,0,1},
                {1,1,2,1,1},
                {1,1,0,1}
        };

        int ans = lmao_ded(arr , 3,2,0);
        System.out.println(ans);

    }

    static int lmao_ded(int[][]array , int indexrow , int indexcol , int traget  ){
int count = 0;
        // for checking from the index to left top corner
        int col1 = indexcol;
        for(int row  = indexrow ; row>=0&& col1>=0; row--){
//            System.out.println(array[row][col1]);
            if(traget==array[row][col1]){
                count++;
            }
            col1--;
        }
//        System.out.println("");
        // for checking from the index to bottom right corner hello folks
        int col2 = indexcol;
        for(int row  = indexrow ; row<array.length&& col2<array.length; row++){
//            System.out.println(array[row][col2]);
            if(traget==array[row][col2]){
                count++;
            }
            col2++;
        }
//        System.out.println("");
        // for checking from the index to top right corner
        int col3 = indexcol;
        for(int row  = indexrow ; row>=0&& col3<array.length; row--){
//            System.out.println(array[row][col3]);
            if(traget==array[row][col3]){
                count++;
            }
            col3++;
        }
        // for checking from the index to top right corner
        int col4 = indexcol;
        for(int row  = indexrow ; row<array.length&& col4>=0; row++){
//            System.out.println(array[row][col4]);
            if(traget==array[row][col4]){
                count++;
            }
            col4--;
        }

return count;

    }
}


//TUSHAR GUPTA (trust_afk)
