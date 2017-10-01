package array.task.answer;

import java.util.Arrays;

public class TASK1 {

    private TASK1(){}

    public static int pairedNumber(int [] randomNumbers){ // метод которий повертает парние числа в масиве
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


    public static int SumMultipliedElements(int [] randomNumbers){ // сума елементов умноженых на три
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

    public static int DifferenceMaxMin(int[] randomNumber){ // разница межу максимальним и минимальним елементом
        if (randomNumber.length > 0){
            Arrays.sort(randomNumber);
            int maxElemrnt = randomNumber[randomNumber.length-1];
            int minElement = randomNumber[0];
            return  maxElemrnt - minElement;
        }
        else
            return 0;
    }

    public static float ArithmeticMeanArray(int[] randomNumbers){ // середне ариметичне масива
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

    public static int SumLargestAndSmallestElem(int[] randomNumbers){ // сума самых больших и наименьших элементов массива
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

    public static int maximumModuleElem(int[] randomNumbers){ // максимальный элемент модуля массива
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
