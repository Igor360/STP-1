package array;

import java.util.Arrays;
import java.util.Random;

public class GenerateArrayData {

    private GenerateArrayData(){}

    public static int[] generateData(int sizeArray)
    {
        Random randomNumber = new Random();
        int [] randomNumbers = new int [sizeArray];
        //  int from = -10;
        //  int to = 100;
        for (int i = 0; i < sizeArray; i++) {
            //randomNumbers[i] = from + (int) (Math.random() * to);
            randomNumbers[i] = randomNumber.nextInt();
        }
        return randomNumbers;
    }


    public static int[][] generateSquareArray(int row, int col){ // генерация квадратного масива
        Random randomNumber = new Random();
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
