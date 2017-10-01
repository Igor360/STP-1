package array.task.answer;

import java.util.Arrays;


/**
 * клас из решениям задания 1
 */
public class TASK1 {

    private TASK1(){}

    /**
     * метод которий повертает парние числа в масиве
     * @param randomNumbers
     * @return
     */

    public static int pairedNumber(int [] randomNumbers){
        if (randomNumbers.length > 0){
            int pairedNumbers = 0;
            Arrays.sort(randomNumbers);
            int arrayLength = randomNumbers.length;
            for (int i = 0; i < arrayLength-1; i++)
                for(int j = i+1; j < arrayLength; j++ )
                    if (randomNumbers[i] == randomNumbers[j]){
                        pairedNumbers++;
                        break;
                    }
            return pairedNumbers;
        }
        else
            return 0;
    }

    /**
     * сума елементов умноженых на три
     * @param randomNumbers
     * @return
     */
    public static int SumMultipliedElements(int [] randomNumbers){
        if (randomNumbers.length > 0){
            int sumMultipliedEl = 0;
            int lengthArray = randomNumbers.length;
            for (int i = 0; i < lengthArray; i++)
                if (randomNumbers[i] % 3 == 0)
                    sumMultipliedEl += randomNumbers[i];
            return  sumMultipliedEl;
        }
        else
            return 0;
    }

    /**
     *
     * разница межу максимальним и минимальним елементом
     * @param randomNumber
     * @return
     */
    public static int DifferenceMaxMin(int[] randomNumber){
        if (randomNumber.length > 0){
            Arrays.sort(randomNumber);
            int maxElemrnt = randomNumber[randomNumber.length-1];
            int minElement = randomNumber[0];
            return  maxElemrnt - minElement;
        }
        else
            return 0;
    }

    /**
     *  середне ариметичне масива
     * @param randomNumbers
     * @return
     */

    public static double ArithmeticMeanArray(int[] randomNumbers){
        if (randomNumbers.length > 0){
            int sumElements = 0;
            int numElements = randomNumbers.length;
            for(int i = 0; i < numElements; i++)
                sumElements += randomNumbers[i];
            return  sumElements / numElements;
        }
        else
            return 0;
    }

    /**
     * сума самых больших и наименьших элементов массива
     * @param randomNumbers
     * @return
     */
    public static int SumLargestAndSmallestElem(int[] randomNumbers){
        if (randomNumbers.length > 0){
            Arrays.sort(randomNumbers);
            int sumMaxElements = 0;
            int sumMinElements = 0;
            int lengthArray = randomNumbers.length;

            int maxElem = randomNumbers[lengthArray-1];
            int minElem = randomNumbers[0];

            for (int i = 0; i < lengthArray; i++)
                if (randomNumbers[i] == minElem)
                    sumMinElements += randomNumbers[i];
                else
                    break;
            for (int j = lengthArray - 1; j > 0; j--)
                if(randomNumbers[j] == maxElem)
                    sumMaxElements += randomNumbers[j];
                else
                    break;

            return sumMinElements + sumMaxElements;
        }
        else
            return  0;
    }

    /**
     * максимальный элемент модуля массива
     * @param randomNumbers
     * @return
     */
    public static int maximumModuleElem(int[] randomNumbers){
        if(randomNumbers.length > 0){
            int lengthArray = randomNumbers.length;
            for (int i = 0; i < lengthArray; i++)
                randomNumbers[i] = Math.abs(randomNumbers[i]);
            Arrays.sort(randomNumbers);
            return randomNumbers[lengthArray - 1];
        }
        else
            return 0;
    }

}
