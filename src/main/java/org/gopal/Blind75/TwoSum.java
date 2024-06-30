package org.gopal.Blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        int[] index = getIndexOfTargetValue(15, new int[]{5, 7, 8, 2, 4});
        int[] index2 = getIndexOfTargetValue(10, new int[]{5, 7, 8, 2, 4});
        System.out.println(Arrays.toString(index));
        System.out.println(Arrays.toString(index2));
    }

    private static int[] getIndexOfTargetValue(int target, int[] arr) {
        Map<Integer, Integer> arrayValueWithMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int difference = target - arr[i];
            if (arrayValueWithMap.containsKey(difference)) {
                return new int[]{arrayValueWithMap.get(difference), i};
            }
            arrayValueWithMap.put(arr[i], i);
        }
        return null;
    }

    private static int[] getIndexOfTargetValueStream(int target, int[] arr) {
        Map<Integer, Integer> arrayValueWithMap = new HashMap<>();

        // Using IntStream to iterate over the indices of the array
        return IntStream.range(0, arr.length).mapToObj(i -> {
            int difference = target - arr[i];
            if (arrayValueWithMap.containsKey(difference)) {
                return new int[]{arrayValueWithMap.get(difference), i};
            }
            arrayValueWithMap.put(arr[i], i);
            return null;
        }).filter(result -> result != null).findFirst().orElse(null);
    }
}
