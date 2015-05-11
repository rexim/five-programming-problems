package me.rexim.fiveproblems;

import java.util.Arrays;
import java.util.Comparator;

public class Problem4 {
    public static int formLargestNumber(int[] xs) {
        String[] ys = new String[xs.length];

        for (int i = 0; i < ys.length; ++i) {
            ys[i] = Integer.toString(xs[i]);
        }

        Arrays.sort(ys, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });

        int s = 0;

        for (String y : ys) {
            for (int i = 0; i < y.length(); ++i) {
                s = y.charAt(i) - '0' + s * 10;
            }
        }

        return s;
    }
}
