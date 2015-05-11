package me.rexim.fiveproblems.test;

import me.rexim.fiveproblems.Problem5;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class Problem5Test {
    @Test
    public void testPossibleExpressions() throws Exception {
        String[] expectedExpressions = new String[] {
                "1 + 2 + 3 - 4 + 5 + 6 + 78 + 9",
                "1 + 2 + 34 - 5 + 67 - 8 + 9",
                "1 + 23 - 4 + 5 + 6 + 78 - 9",
                "1 + 23 - 4 + 56 + 7 + 8 + 9",
                "12 + 3 + 4 + 5 - 6 - 7 + 89",
                "12 + 3 - 4 + 5 + 67 + 8 + 9",
                "12 - 3 - 4 + 5 - 6 + 7 + 89",
                "123 + 4 - 5 + 67 - 89",
                "123 + 45 - 67 + 8 - 9",
                "123 - 4 - 5 - 6 - 7 + 8 - 9",
                "123 - 45 - 67 + 89"
        };

        String[] actualExpressions = Problem5.possibleExpressions();

//        for (String expression : actualExpressions) {
//            System.out.println(expression);
//        }

        assertEqualsNoOrder(actualExpressions, expectedExpressions);
    }
}
