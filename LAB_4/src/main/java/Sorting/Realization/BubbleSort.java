    package Sorting.Realization;


    import Interface.UserInterface;
    import array.Array;

    import java.io.PrintStream;

    /**
     * it is class who realize bubble sorting
     */
    public class BubbleSort {

        public BubbleSort(){}
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

        public static void showTimeSorting(Array array){
            long start = 0, end = 0;
            start = System.nanoTime();
            sort(array.getArray());
            end = System.nanoTime();
            System.out.printf("Bubble sort time : %s \n\r", UserInterface.changeTimeFormat(end - start));
        }



    }
