package me.rexim.fiveproblems;

import java.util.ArrayList;

public class Problem5 {
    public static String[] possibleExpressions() {
        ArrayList<String> result = new ArrayList<>();
        possibleExpressionsImpl(2, 1, 1, "+", "1", result);
        return result.toArray(new String[result.size()]);
    }

    private static void possibleExpressionsImpl(int i, int sum, int f, String lastOp, String expr, ArrayList<String> acc) {
        if (i > 9) {
            if (sum == 100) {
                acc.add(expr);
            }
            return;
        }

        possibleExpressionsImpl(i + 1, sum + i, i, "+", expr + " + " + i, acc);
        possibleExpressionsImpl(i + 1, sum - i, i, "-", expr + " - " + i, acc);
        possibleExpressionsImpl(i + 1,
                sum + f * (lastOp.equals("-") ? 1 : -1) + (f * 10 + i) * (lastOp.equals("-") ? -1 : 1),
                f * 10 + i, lastOp, expr + i, acc);
    }
}
