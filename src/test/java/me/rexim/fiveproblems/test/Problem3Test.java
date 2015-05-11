package me.rexim.fiveproblems.test;

import me.rexim.fiveproblems.Problem3;
import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;

public class Problem3Test {
    @Test
    public void testGenerateFirst100FibonacciNumbers() throws Exception {
        int[] fibonacci100 = Problem3.generateFirst100FibonacciNumbers();
        assertNotNull(fibonacci100);
        assertEquals(100, fibonacci100.length);
        assertEquals(0, fibonacci100[0]);
        assertEquals(1, fibonacci100[1]);

        for (int i = 2; i < 100; ++i) {
            assertTrue(fibonacci100[i] == fibonacci100[i - 1] + fibonacci100[i - 2]);
        }
    }
}
