import Sorting.Realization.BubbleSort;
import Sorting.Realization.SelectionSort;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SelectionSortTest {

    int [] arr = null;

    @Before
    public void init(){
        arr = new int [] {2,1,4,5};
    }

    @Test
    public void SortTest(){
        SelectionSort.sort(arr);
        assertEquals("[1, 2, 4, 5]", Arrays.toString(arr));
    }
}
