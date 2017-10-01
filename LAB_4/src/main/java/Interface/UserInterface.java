package Interface;

import Sorting.Realization.*;
import Sorting.Realization.Sort;
import array.Array;
import array.task.answer.show.ShowAnswer;
import hello.world.HelloWorld;

import java.util.Arrays;
import java.util.Scanner;


/**
 *  console commands
 */
enum UICommands{
    alltimes,
    exit,
    help,
    author,
    showarray,
    bubblesort,
    mergesort,
    oddevensort,
    selectionsort,
    quicksort,
    arraysort,
    insertsort,
    helloWord,
    lab2
}


/**
 *  it is class who realize work with console
 */
public class UserInterface {

    private static String command = new String(); //value for selecting data
    private static Array array = null;
    private static int sizeArray = 0;
    private static Scanner scanner = new Scanner(System.in); // get data from keyboard
    private static long memoryBegin = Runtime.getRuntime().freeMemory();


    /**
     *  start the program
     */
    public static void start(){
        setSizeArray(scanner);
        setCommand(scanner);
    }

    /**
     * get command from keyboard
     * @param inputData
     */
    public static void setCommand(Scanner inputData){ //
        do{
            try{
                System.out.println("Введите команду: ");
                command = inputData.next();
                break;
            }catch (Exception e){
                inputData = new Scanner(System.in);
                System.out.println("Даные введение не верно!!!!");
                continue;
            }
        }while (true);
        commandProcessing();
    }

    /**
     * set size array and then generate them
     * @param inputCommand
     */
    public static void setSizeArray(Scanner inputCommand){
        do{
            try{
                System.out.println("Введите размер масива: ");
                sizeArray = inputCommand.nextInt();
                break;
            }catch (Exception e){
                inputCommand = new Scanner(System.in);
                System.out.println("Даные введение не верно!!!!");
                continue;
            }
        }while (true);
        array = new Array(sizeArray); // generate array
    }


    /**
     *  show on screen all commands
     */
    public static void showCommands(){
        System.out.println("Все команди: ");
        for (UICommands comand: UICommands.values()) {
            System.out.println(comand.toString());
        }

    }

    /**
     * method who processing commands typed in from keyboard
     */
    public static void commandProcessing(){
        long start = 0, end = 0;
        UICommands sorting = null;
        if(array != null){
            try {
               sorting = UICommands.valueOf(command);
            }catch (Exception e){
                System.out.println("Не верно введена команда");
                setCommand(scanner);
            }
        switch (sorting){
            case bubblesort:
                array.resetData();
                BubbleSort.showTimeSorting(array);
                break;
            case arraysort:
                array.resetData();
                start = System.nanoTime();
                Arrays.sort(array.getArray());
                end = System.nanoTime();
                System.out.printf("Arrays default sorting time : %s \n\r", changeTimeFormat(end - start));
                break;
            case mergesort:
                array.resetData();
                MergeSort.showTimeSorting(array);
                break;
            case quicksort:
                array.resetData();
                QuickSort.showTimeSorting(array);
            case insertsort:
                array.resetData();
                start = System.nanoTime();
                Sort.insertion(array.getArray());
                end = System.nanoTime();
                System.out.printf("Insert sort time : %s \n\r", changeTimeFormat(end - start));
                break;
            case oddevensort:
                array.resetData();
                OddEvenSort.showTimeSorting(array);
                break;
            case selectionsort:
                array.resetData();
                SelectionSort.showTimeSorting(array);
                break;
            case alltimes:
                allSortingTimes();
            break;
            case help:
                showCommands();
                break;
            case exit:
                return;
            case showarray:
                array.showArray();
                break;
            case helloWord:
                HelloWorld.show();
                break;
            case lab2:
                ShowAnswer.Show();
                break;
            case author:
                System.out.printf("Davidenko Igor \n\r");
                return;
            default:
                break;
         }
        setCommand(scanner);
        }else {
            System.out.print("Масив не задан!!!!");
        }

    }

    /**
     * show all sorting
     */
    public static void allSortingTimes(){
        long start = 0, end = 0;
        array.resetData();
        BubbleSort.showTimeSorting(array);

        array.resetData();
        start = System.nanoTime();
        Arrays.sort(array.getArray());
        end = System.nanoTime();
        System.out.printf("Arrays default sorting time : %s \n\r", changeTimeFormat(end - start));

        array.resetData();
        MergeSort.showTimeSorting(array);

        array.resetData();
        QuickSort.showTimeSorting(array);

        array.resetData();
        start = System.nanoTime();
        Sort.insertion(array.getArray());
        end = System.nanoTime();
        System.out.printf("Insert sort time : %s \n\r", changeTimeFormat(end - start));

        array.resetData();
        OddEvenSort.showTimeSorting(array);

        array.resetData();
        SelectionSort.showTimeSorting(array);

    }


    /**
     * method who represent numbers in next format : "1 000 000"
     * @param time
     * @return
     */
    public static String changeTimeFormat(long time){
        char [] textArray = Long.toString(time).toCharArray();
        int iter = 0;
        StringBuffer finalyTime = new StringBuffer();
        for (int i = textArray.length - 1; i >= 0; i--) {
            finalyTime.append(textArray[iter]);
            if (i%3 == 0)
                finalyTime.append(" ");
            iter++;
        }
        return finalyTime.toString();
    }
}


