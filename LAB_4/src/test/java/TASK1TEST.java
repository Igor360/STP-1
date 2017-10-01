import array.task.answer.TASK1;
import array.task.answer.TASK2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TASK1TEST {
    int Paired = 0;
    int sumMultEl = 0;
    int DifMinMax = 0;
    double ArifMeanAr = 0.0;
    int SumMaxMin = 0;
    int MaxModEl = 0;


    @Before
    public void init(){
        int [] array = new int [] { 1, 2, 3, 4, 4 };
        this.Paired = TASK1.pairedNumber(array);
        this.sumMultEl = TASK1.SumMultipliedElements(array);
        this.DifMinMax = TASK1.DifferenceMaxMin(array);
        this.ArifMeanAr = TASK1.ArithmeticMeanArray(array);
        this.SumMaxMin = TASK1.SumLargestAndSmallestElem(array);
        this.MaxModEl = TASK1.maximumModuleElem(array);
    }

    @Test
    public void pairedNumbersTest(){
        assertEquals(1, this.Paired);
    }

    @Test
    public void SumMultipliedElTEST(){
        assertEquals(3, this.sumMultEl);
    }

    @Test
    public void DifferentMaxMinTEST(){
        assertEquals(3, this.DifMinMax);
    }

    @Test
    public void ArithmeticMeanArrayTEST(){
        assertEquals( 2.0, this.ArifMeanAr, 0.0001);
    }

    @Test
    public void SumLargestAndSmallestElTEST(){
        assertEquals(9, this.SumMaxMin);
    }

    @Test
    public void maximumModuleElTEST(){
        assertEquals(4, this.MaxModEl);
    }
}
