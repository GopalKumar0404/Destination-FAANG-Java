package org.gopal.Blind75;

import java.util.stream.IntStream;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int maxProfit = maxProfitFromStock(new int[]{12, 10, 8, 7, 3, 9, 1, 5});
        int maxProfit2 = maxProfitFromStockStream(new int[]{12, 10, 8, 7,50, 3, 9, 1, 5});
        int maxProfit3 = maxProfitFromStockCustomObject(new int[]{12, 10, 8, 7,50, 63, 9, 1, 5});
        System.out.println(maxProfit);
        System.out.println(maxProfit2);
        System.out.println(maxProfit3);
    }

    private static int maxProfitFromStockCustomObject(int[] arr) {
        class ProfitTracker{
            int min = Integer.MAX_VALUE;
            int max = 0;
        }
        ProfitTracker tracker = new ProfitTracker();
        IntStream.range(0, arr.length).forEach(i -> {
            if (arr[i] < tracker.min) {
                tracker.min = arr[i];
            }
            tracker.max = Math.max(tracker.max, arr[i] - tracker.min);
        });
        return tracker.max== 0 ? -1 : tracker.max;

    }
    private static int maxProfitFromStockStream(int[] arr) {
        int[] minAndMaxProfit = {Integer.MAX_VALUE, 0};

        IntStream.range(0, arr.length).forEach(i -> {
            if (arr[i] < minAndMaxProfit[0]) {
                minAndMaxProfit[0] = arr[i];
            }
            minAndMaxProfit[1] = Math.max(minAndMaxProfit[1], arr[i] - minAndMaxProfit[0]);
        });
        return minAndMaxProfit[1] == 0 ? -1 : minAndMaxProfit[1];

    }

    private static int maxProfitFromStock(int[] arr) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            maxProfit = Math.max(maxProfit, arr[i] - min);
        }
        return maxProfit == 0 ? -1 : maxProfit;
    }
}
