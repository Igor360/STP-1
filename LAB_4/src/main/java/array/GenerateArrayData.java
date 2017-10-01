package array;

import java.util.Arrays;
import java.util.Random;

/**
 * class who generated data for array
 */
public class GenerateArrayData {

    private GenerateArrayData(){}
    private static Random randomNumber = new Random();

    /**
     * generate data for array
     * @param sizeArray
     * @return
     */
    public static int[] generateData(int sizeArray)
    {
        int [] randomNumbers = new int [sizeArray];
        //  int from = -10;
        //  int to = 100;
        for (int i = 0; i < sizeArray; i++) {
            //randomNumbers[i] = from + (int) (Math.random() * to);
            randomNumbers[i] = randomNumber.nextInt();
        }
        return randomNumbers;
    }


    /**
     * generate data from square array
     * @param row - rows
     * @param col - column
     * @return
     */
    public static int[][] generateSquareArray(int row, int col){
        int from = -10;
        int to = 100;
        int [][] randomNumbers = new int [row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                randomNumbers[i][j] = from + (int) (Math.random() * to);
                //randomNumbers[i][j] = randomNumber.nextInt();
            }
        return randomNumbers;
    }

}
