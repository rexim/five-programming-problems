package me.rexim.fiveproblems;

public class Problem1 {
    public static int sumFor(int[] xs) {
        int s = 0;
        for (int x : xs) {
            s += x;
        }
        return s;
    }

    public static int sumWhile(int[] xs) {
        int s = 0;
        int i = 0;
        while (i < xs.length) {
            s += xs[i];
            ++i;
        }
        return s;
    }

    public static int sumRecursion(int[] xs) {
        return sumRecursionImpl(xs, 0);
    }

    private static int sumRecursionImpl(int[] xs, int i) {
        if (i < xs.length) {
            return xs[i] + sumRecursionImpl(xs, i + 1);
        } else {
            return 0;
        }
    }

    public static int sumRecursionAcc(int[] xs) {
        return sumRecursionAccImpl(xs, 0, 0);
    }

    private static int sumRecursionAccImpl(int[] xs, int i, int acc) {
        if (i < xs.length) {
            return sumRecursionAccImpl(xs, i + 1, xs[i] + acc);
        } else {
            return acc;
        }
    }
}
