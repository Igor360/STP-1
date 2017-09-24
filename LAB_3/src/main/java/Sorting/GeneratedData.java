package Sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * it is class who generate array
 */
public class GeneratedData {
    private int arraySize;
    private int []arrayElements = null; // array elements
    private Random generatorElements = new Random(); // create object
    private int [] arrayCopy = null;

    /**
     *
     * @return size array
     */
    public int getSize() { // get size array
        return arraySize;
    }

    /**
     *
     * @return array
     */
    public int[] getArray() { return arrayElements; }

    /**
     * initialize array
     * class constructor
     * @param size array
     */
    public GeneratedData(int size){
        this.arraySize = size;
        arrayElements = new int[size];
        generateArray(); // after create array, generate him
    }

    /**
     * populating an array with random data
     */
    public void generateArray(){ // method whose addition data to our array
        int generatedNumber = 0;
        for (int i = 0; i < this.arraySize; i++){
            generatedNumber = generatorElements.nextInt();
            arrayElements[i] = generatedNumber;
        }
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
     * @param position - position element
     * @return  retun element using her position
     */

    public int getElement(int position){
        return arrayElements[position];
    }

    /**
     * set data for element in array
     * @param position element
     * @param newData new value array element
     */
    public void setElement(int position, int newData){
        arrayElements[position] = newData;
    }

    /**
     * method who print the value to the console
     */
    public void showArray(){ // method whose showing array data
        System.out.printf("Array: %s \n", Arrays.toString(arrayElements));
    }


}
