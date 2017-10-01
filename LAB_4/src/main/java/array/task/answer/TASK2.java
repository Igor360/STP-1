package array.task.answer;

import java.util.ArrayList;
import java.util.List;

public class TASK2 {

    private TASK2() {}

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

}
