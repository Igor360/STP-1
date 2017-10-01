import array.task.answer.TASK2;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TASK2TEST {
    private int [][] array = new int [][]{ { 1,2 },{ 2, 3 }, {2 , -4 } };
    String sumBeforeNeg = new String();
    String sumAfterNeg = new String();
    String numRowNullEl = new String();
    String numRowSameElem = new String();


    @Before
    public void init(){
        sumBeforeNeg = TASK2.getSumBeforeNegativeEl(array).toString();
        sumAfterNeg = TASK2.getSumAfterNegativeEl(array).toString();
        numRowNullEl = TASK2.getNumberRowNullElem(array).toString();
        numRowSameElem = TASK2.getNumberRowSameElem(array).toString();
    }

    @Test
    public void  getSumBeforeNegElTest(){
        assertEquals("[100 , 100 , 2 ]", sumBeforeNeg);
    }

    @Test
    public void getSumAfterNegElTest(){
        assertEquals("[-1 , -1 , -4 ]", sumAfterNeg);
    }

    @Test
    public void NumberRowsWithNullElTest(){
        assertEquals("[]", numRowNullEl);
    }

    @Test
    public void NumberRowsSameElTest(){
        assertEquals("[]", numRowSameElem);
    }

}
