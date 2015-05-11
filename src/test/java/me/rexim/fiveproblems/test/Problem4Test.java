package me.rexim.fiveproblems.test;

import me.rexim.fiveproblems.Problem4;
import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;

public class Problem4Test {
    @Test
    public void testFormLargestNumber() throws Exception {
        assertEquals(95021, Problem4.formLargestNumber(new int[] {50, 2, 1, 9}));
    }
}
