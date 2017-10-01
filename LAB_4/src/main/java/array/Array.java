package array;

import java.util.Arrays;
import java.util.Random;

/**
 * it is class who consist array
 */
public class Array {

        private int arraySize;
        private int []arrayElements = null;
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
        public Array(int size){
            this.arraySize = size;
            arrayElements = new int[size];
            generateArray(); // after create array, generate him
        }


        /**
         * populating an array with random data
         */
        public void generateArray(){ // method whose addition data to our array
            int generatedNumber = 0;
            arrayElements = GenerateArrayData.generateData(arraySize);
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
