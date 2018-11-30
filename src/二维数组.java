package demo;

public class 二维数组 {
    public static void main(String[] args) {
      //  int[][] matrix;
      //  matrix=new int[5][5];
      //  matrix[2][1]=1;
      //  matrix[3][2]=2;
        int[][] matrix={
                {45,7,88,1,8,9},
                {5,7,8,11},
                {41,12,8,9},
                {},
        };
        System.out.println(matrix.length);
        for(int[] temArry :matrix){//遍历两遍
            for (int temp :temArry){
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}
