package Sorting;

import java.util.Arrays;
import java.util.Random;

public class GeneratedData { // create generic class

    private int arraySize;
    private int []arrayElements = null; // create generic array using class arraylist
    private Random generatorElements = new Random(); // create object

    private int [] arrayCopy = null;

    public int getSize() { // get size array
        return arraySize;
    }
    public int[] getArray() { return arrayElements; }

    public GeneratedData(int size){ // constructor
        this.arraySize = size;
        arrayElements = new int[size];
        arrayCopy = new int[size];
        generateArray(); // after create array, generate him
    }

    public void generateArray(){ // method whose addition data to our array
        int generatedNumber = 0;
        for (int i = 0; i < this.arraySize; i++){
            generatedNumber = generatorElements.nextInt(10);
            arrayElements[i] = generatedNumber;
            arrayCopy[i] = generatedNumber;
        }
    }

    public void resetData(){ // repair default data
        arrayElements = arrayCopy;
    }
    // create indexer
    public int getElement(int position){ //  get element by his index
        return arrayElements[position];
    }
    public void setElement(int position, int newData){ // change element using his index
        arrayElements[position] = newData;
    }

    public void showArray(){ // method whose showing array data
        System.out.printf("Array: %s \n", Arrays.toString(arrayElements));
    }

    public boolean comparisonTwoNumbers(int indexFirstElement, int indexSecondElement, String operation) { // method whose compare two numbers
        switch (operation){
            case ">":
                return arrayElements[indexFirstElement] > arrayElements [indexSecondElement] ? true : false;

            case "<":
                return arrayElements[indexFirstElement] < arrayElements[indexSecondElement] ? true : false;

            case ">=":
                return arrayElements[indexFirstElement] >= arrayElements[indexSecondElement] ? true : false;

            case "<=":
                return arrayElements[indexFirstElement] <= arrayElements[indexSecondElement] ? true : false;

            case  "==":
                return arrayElements[indexFirstElement] == arrayElements[indexSecondElement] ? true : false;

            default:
                return false;

        }
    }

}
