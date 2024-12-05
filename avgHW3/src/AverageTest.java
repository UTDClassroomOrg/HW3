import org.junit.Test;
import static org.junit.Assert.*;

public class AverageTest {

    /* Part E: Implement the average function in a class Average and generate test cases using Junit. */
    @Test
    public void testAverage() {
        // Create an instance of Average
        Average avg = new Average();

        // Functional test cases
        assertEquals(0, avg.calcAverage(0, new int[]{2, 4, 6, 8, 10}));
        assertEquals(1, avg.calcAverage(2, new int[]{1, 2, 3, 4, 5}));
        assertEquals(20, avg.calcAverage(3, new int[]{10, 20, 30, 40}));

        // Boundary test cases
        assertEquals(0, avg.calcAverage(0, new int[]{10, 20, 30}));
        assertEquals(0, avg.calcAverage(4, new int[]{5, 15, 25}));
    }
}
