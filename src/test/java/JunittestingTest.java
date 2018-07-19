import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunittestingTest {

    @Test
    public void square() {
        Junittesting test=new Junittesting();
        int output=test.square(5);
        assertEquals(25,output);
    }

    @Test
    public void counta() {
        Junittesting test=new Junittesting();
        int output=test.counta("Abracadabra");
        assertEquals(5,output);

    }
}
