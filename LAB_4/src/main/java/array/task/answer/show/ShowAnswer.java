package array.task.answer.show;

import array.Array;
import array.GenerateArrayData;
import array.SquareArray;
import array.task.answer.TASK1;
import array.task.answer.TASK2;

import java.util.Arrays;
import java.util.Scanner;

public class ShowAnswer {
    private ShowAnswer (){}
    private static Array arrayNumbers = null;
    private static SquareArray sqArrayNumbers= null;
    private static Scanner inputText = new Scanner(System.in);

    protected static void getDataForTASK1(){
        inputText = new Scanner(System.in);
        int size = 0;
        do {
            System.out.printf("\n Введите размер масива: \n");
            try{
                size = inputText.nextInt();
            } catch (Exception e){
                System.out.printf("\n Спробуй еще раз....)");
                inputText = new Scanner(System.in);
                continue;
            }
        }while (size == 0);

        arrayNumbers = new Array(size);
        int index = 0;
        do {
            System.out.printf("\n Введите %s елемент масива: ", index);
            try{
                arrayNumbers.setElement(index,inputText.nextInt());
            } catch (Exception e){
                System.out.printf("\n Спробуй еще раз....)");
                inputText = new Scanner(System.in);
                continue;
            }
            index++;
        }while(index < size);
    }

    protected static void getDataForTASK2(){
        int size = 0;
        do {
            System.out.printf("\n Введите размер квадратного масива: \n");
            try{
                size = inputText.nextInt();
            } catch (Exception e){
                System.out.printf("\n Спробуй еще раз....)");
                inputText = new Scanner(System.in);
                continue;
            }
        }while (size == 0);
        sqArrayNumbers = new SquareArray(size,size);
    }

    public static void Show(){
        getDataForTASK1();
        System.out.printf("TASK 1 \n");
        System.out.printf("Paired number : %s \n", TASK1.pairedNumber(arrayNumbers.getArray()));
        System.out.printf("Sum of the elements multiplied by 3 : %s \n", TASK1.SumMultipliedElements(arrayNumbers.getArray()));
        System.out.printf("Difference between the maximum and the minimum elements array : %s \n", TASK1.DifferenceMaxMin(arrayNumbers.getArray()));
        System.out.printf("Arithmetic mean of the array : %s \n", TASK1.ArithmeticMeanArray(arrayNumbers.getArray()));
        System.out.printf("Sum of the largest and smallest elements of the array : %s \n", TASK1.SumLargestAndSmallestElem(arrayNumbers.getArray()));
        System.out.printf("Maximum by module element of the array: %s \n", TASK1.maximumModuleElem(arrayNumbers.getArray()));
        Arrays.sort(arrayNumbers.getArray());
        arrayNumbers.showArray();

        getDataForTASK2();
        System.out.printf("\n TASK 2 \n");
        sqArrayNumbers.showArray();
        System.out.printf("The sum of the elements located behind the first negative element in i-th line : %s \n", TASK2.getSumBeforeNegativeEl(sqArrayNumbers.getArray()).toString());
        System.out.printf("The sum of the elements preceding the last negative element i-th line : %s \n", TASK2.getSumAfterNegativeEl(sqArrayNumbers.getArray()).toString());
        System.out.printf("All elements of which are zeros: %s \n", TASK2.getNumberRowNullElem(sqArrayNumbers.getArray()).toString());
        System.out.printf("The elements in each of them are the same: %s \n", TASK2.getNumberRowSameElem(sqArrayNumbers.getArray()).toString());
    }
}
