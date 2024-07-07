package org.gopal.Blind75;

public class MinimumInSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6,7, -2, -1, 0, 1, 2, 3};
        int minimum = findMinimumInSortedArray(arr);
        System.out.println(minimum);
    }

    private static int findMinimumInSortedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int ans = arr[0];
        while (left <= right) {
            if (arr[left] < arr[right])
                ans = Math.min(ans, arr[left]);
            mid = (left + right) / 2;
            ans = Math.min(ans, arr[mid]);
            if (arr[left] <= arr[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return ans;
    }
}
