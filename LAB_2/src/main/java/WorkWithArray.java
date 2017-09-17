import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WorkWithArray {
    public static void main(String []args)
    {
        int [] arrayNumbers = generateData(10);
        System.out.printf("TASK 1 \n");
        System.out.printf("Paired number : %s \n", pairedNumber(arrayNumbers));
        System.out.printf("Sum of the elements multiplied by 3 : %s \n", SumMultipliedElements(arrayNumbers));
        System.out.printf("Difference between the maximum and the minimum elements array : %s \n", DifferenceMaxMin(arrayNumbers));
        System.out.printf("Arithmetic mean of the array : %s \n", ArithmeticMeanArray(arrayNumbers));
        System.out.printf("Sum of the largest and smallest elements of the array : %s \n", SumLargestAndSmallestElem(arrayNumbers));
        System.out.printf("Maximum by module element of the array: %s \n", maximumModuleElem(arrayNumbers));
        Arrays.sort(arrayNumbers);
        System.out.printf("Array : %s", Arrays.toString(arrayNumbers));

        int [][] sqArrayNumbers = generateSquareArray(10);
        System.out.printf("\n TASK 2 \n");

        WorkWithArray.showSquareArray(sqArrayNumbers);
        System.out.printf("The sum of the elements located behind the first negative element in i-th line : %s \n", getSumBeforeNegativeEl(sqArrayNumbers).toString());
        System.out.printf("The sum of the elements preceding the last negative element i-th line : %s \n", getSumAfterNegativeEl(sqArrayNumbers).toString());
        System.out.printf("All elements of which are zeros: %s \n", getNumberRowNullElem(sqArrayNumbers).toString());
        System.out.printf("The elements in each of them are the same: %s \n", getNumberRowSameElem(sqArrayNumbers).toString());

    }

    public static int[] generateData(int sizeArray) // метод которий генерирует даные
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

    public static int pairedNumber(int [] randomNumbers){ // метод которий повертает парние числа в масиве
        if (randomNumbers.length > 0){
            int pairedNumbers = 0;
            Arrays.sort(randomNumbers);
            int arrayLength = randomNumbers.length;
            for (int i = 0; i < arrayLength-1; i+=2)
                if (randomNumbers[i] == randomNumbers[i+1])
                    pairedNumbers++;
            return pairedNumbers;
        }
        else
            return 0;
    }

    public static int SumMultipliedElements(int [] randomNumbers){ // сума елементов умноженых на три
        if (randomNumbers.length > 0){
            int sumMultipliedEl = 0;
            int lenthArray = randomNumbers.length;
            for (int i = 0; i < lenthArray; i++)
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

    public static int[][] generateSquareArray(int size){ // генерация квадратного масива
        Random randomNumber = new Random();
      //  int from = -10;
      //  int to = 100;
        int [][] randomNumbers = new int [size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                //randomNumbers[i][j] = from + (int) (Math.random() * to);
                randomNumbers[i][j] = randomNumber.nextInt();
        }
        return randomNumbers;
    }

    public static List<String> getSumBeforeNegativeEl(int [][] randomNumbers){ //  сумма элементов, расположенных за первым отрицательным элементом в i-й строке (если все элементы линии неотрицательны, возьмите bi = 100);

        int row = randomNumbers.length;
        int col = randomNumbers[0].length;
        int positionNegativeEl = 0;
        int sumElem = 0;

        List<String> SumBeforeNegativeEl = new ArrayList<String>();
        boolean isNegativeEl = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                if (randomNumbers[i][j] < 0) {
                    positionNegativeEl = j;
                    isNegativeEl = true;
                    break;
                }
            if (isNegativeEl) {
                for (int k = 0; k < positionNegativeEl; k++)
                    sumElem += randomNumbers[i][k];
                SumBeforeNegativeEl.add(sumElem + " ");
                sumElem = 0;
                isNegativeEl = false;
                positionNegativeEl = 0;

            } else {
                SumBeforeNegativeEl.add(100 + " ");
                positionNegativeEl = 0;
            }
        }
        return SumBeforeNegativeEl;
    }

    public static List<String> getSumAfterNegativeEl(int [][] randomNumbers){ // б) сумма элементов, предшествующих последнему отрицательному элементу i-й линии (если все элементы линии неотрицательны, то возьмем bi = -l);
        int row = randomNumbers.length;
        int col = randomNumbers[0].length;
        int positionNegativeEl = 0;
        int sumElem = 0;

        List<String> SumAfterNegativeEl = new ArrayList<String>();
        boolean isNegativeEl = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                if (randomNumbers[i][j] < 0) {
                    positionNegativeEl = j;
                    isNegativeEl = true;
                    break;
                }
            if (isNegativeEl) {
                for (int k = positionNegativeEl; k < col; k++)
                    sumElem += randomNumbers[i][k];
                SumAfterNegativeEl.add(sumElem + " ");
                sumElem = 0;
                isNegativeEl = false;
                positionNegativeEl = 0;

            } else {
                SumAfterNegativeEl.add(-1 + " ");
                positionNegativeEl = 0;
            }
        }
        return SumAfterNegativeEl;
    }

    public static List<String> getNumberRowNullElem(int [][] randomNumbers){ //  все элементы которых являются нулями

        int row = randomNumbers.length;
        int col = randomNumbers[0].length;
        List<String> zeroRow = new ArrayList<String>();

        boolean isNull = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                if (randomNumbers[i][j] != 0) {
                    isNull = false;
                    break;
                } else
                    isNull = true;
        if(isNull){
             zeroRow.add(i + "\t");
            isNull = false;
         }
        }
        return zeroRow;
    }

    public static List<String> getNumberRowSameElem(int [][] randomNumbers){ // елементи есть одинаковие
        int row = randomNumbers.length;
        int col = randomNumbers[0].length;
        List<String> sameRow = new ArrayList<String>();

        boolean isSame = false;
        for (int i = 0; i < row; i++) {
           second: for (int j = 0; j < col-1; j++)
                for(int k = j+1; k < col; k++)
                if (randomNumbers[i][j] != randomNumbers[i][k])
                    isSame = false;
                else{
                    isSame = true;
                    break second;
                }

            if(isSame) {
                    sameRow.add(i + "\t");
                    isSame = false;
            }
        }
        return sameRow;
    }
    public static void showSquareArray(int [][] randomNumbers)
    {
        int row = randomNumbers.length;
        int col = randomNumbers[0].length;
        for (int i = 0; i < row; i++){
            System.out.printf("row "+i+" : ");
            for (int j = 0; j < col; j++)
              System.out.printf(randomNumbers[i][j] + " ");
            System.out.printf("\n");
        }

    }
}

