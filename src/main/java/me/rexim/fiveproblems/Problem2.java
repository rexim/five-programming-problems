package me.rexim.fiveproblems;

public class Problem2 {
    public static String[] interleave(String[] xs, String[] ys) {
        String[] zs = new String[xs.length + ys.length];
        int j = 0;
        int size = Math.max(xs.length, ys.length);

        for (int i = 0; i < size; ++i) {
            if (i < xs.length) {
                zs[j++] = xs[i];
            }
            if (i < ys.length) {
                zs[j++] = ys[i];
            }
        }

        return zs;
    }
}
