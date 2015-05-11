package me.rexim.fiveproblems.test;

import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;
import me.rexim.fiveproblems.Problem2;

public class Problem2Test {
    @Test
    public void testInterleaveSameSize() throws Exception {
        String[] xs = {
                "a", "b", "c"
        };

        String[] ys = {
                "1", "2", "3"
        };

        String[] zs = {
                "a", "1", "b", "2", "c", "3"
        };

        assertArrayEquals(zs, Problem2.interleave(xs, ys));
    }

    @Test
    public void testInterleaveDifferentSize() throws Exception {
        String[] xs = {
                "a", "b", "c"
        };

        String[] ys = {
                "1", "2", "3", "4"
        };

        String[] zs = {
                "a", "1", "b", "2", "c", "3", "4"
        };

        assertArrayEquals(zs, Problem2.interleave(xs, ys));
    }
}
