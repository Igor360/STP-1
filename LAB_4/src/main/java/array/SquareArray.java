package array;

import java.util.Arrays;

public class SquareArray {
    private int arrayNumCol;
    private int arrayNumRow;
    private int [][] arrayElements = null;
    private int [][] arrayCopy = null;

    /**
     *
     * @return number colums
     */
    public int getNumberCol() { // get size array
        return arrayNumCol;
    }


    /**
     *
     * @return number rows
     */
    public int getNumberRow() {
        return arrayNumRow;
    }

    /**
     *
     * @return square array
     */
    public int[][] getArray() { return arrayElements; }

    /**
     * initialize array
     * class constructor
     * @param number column and rows
     */
    public SquareArray(int row, int col){
        this.arrayNumRow = row;
        this.arrayNumCol = col;
        arrayElements = new int[row][col];
        generateArray(); // after create array, generate him
    }


    /**
     * populating an array with random data
     */
    public void generateArray(){ // method whose addition data to our array
        int generatedNumber = 0;
        arrayElements = GenerateArrayData.generateSquareArray(this.arrayNumRow, this.arrayNumCol);
        arrayCopy = arrayElements.clone();
    }

    /**
     * method who return all changes to default values
     */
    public void resetData(){ // repair default data
        arrayElements = arrayCopy;
    }

    /**
     * method who return element array using her index
     * @param row,col - position element
     * @return  retun element using her position
     */

    public int getElement(int row, int col){
        return arrayElements[row][col];
    }

    /**
     * set data for element in array
     * @param row, col -  position element
     * @param newData new value array element
     */
    public void setElement(int row, int col, int newData){
        arrayElements[row][col] = newData;
    }

    /**
     * method who print the value to the console
     */
    public void showArray()
    {
        int row = this.arrayElements.length;
        int col = this.arrayElements[0].length;
        for (int i = 0; i < row; i++){
            System.out.printf("row "+i+" : ");
            for (int j = 0; j < col; j++)
                System.out.printf(this.arrayElements[i][j] + " ");
            System.out.printf("\n");
        }
    }
}
