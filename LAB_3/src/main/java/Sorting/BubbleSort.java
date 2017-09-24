    package Sorting;


    /**
     * it is class who realize bubble sorting
     */
    public class BubbleSort {
        /**
         *  method who sorting our array using bubble sort
         *@param array numbers
         *
         */
        public static void sort(int [] arrayNumbers){
            int size = arrayNumbers.length; // get size array
            int timeValue = 0;
            for (int i = 0; i < size; i++)
            {
                for (int j = 1; j < size - i; j++ ){
                    if (arrayNumbers[j-1] > arrayNumbers[j])
                    {
                        timeValue = arrayNumbers[j-1]; // get element from array
                        arrayNumbers[j-1] = arrayNumbers[j]; //change next element
                        arrayNumbers[j] = timeValue;
                    }

                }
            }
        }



    }
