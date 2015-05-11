package me.rexim.fiveproblems;

public class Problem3 {
    public static int[] generateFirst100FibonacciNumbers() {
        int[] xs = new int[100];
        xs[0] = 0;
        xs[1] = 1;

        for (int i = 2; i < 100; ++i) {
            xs[i] = xs[i - 1] + xs[i - 2];
        }

        return xs;
    }
}
