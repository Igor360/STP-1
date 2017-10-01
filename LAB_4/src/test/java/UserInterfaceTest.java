import Interface.UserInterface;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserInterfaceTest {

    long time = 0;

    @Before
    public void init(){
        time = 666666;
    }

    @Test
    public void ConvertTimeTest(){
        assertEquals("666 666 ", UserInterface.changeTimeFormat(time));
    }

}
