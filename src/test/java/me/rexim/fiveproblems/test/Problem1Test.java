package me.rexim.fiveproblems.test;

import me.rexim.fiveproblems.Problem1;
import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;

public class Problem1Test {
    @Test
    public void testSumFor() throws Exception {
        int[] xs = {1, 2, 3, 4, 5};
        assertEquals(15, Problem1.sumFor(xs));
    }

    @Test
    public void testSumWhile() throws Exception {
        int[] xs = {1, 2, 3, 4, 5};
        assertEquals(15, Problem1.sumWhile(xs));
    }

    @Test
    public void testSumRecursion() throws Exception {
        int[] xs = {1, 2, 3, 4, 5};
        assertEquals(15, Problem1.sumRecursion(xs));
    }

    @Test
    public void testSumRecursionAcc() throws Exception {
        int[] xs = {1, 2, 3, 4, 5};
        assertEquals(15, Problem1.sumRecursionAcc(xs));
    }
}
