package org.gopal.Blind75;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = {-4,-2,5,-1,-3,2,-6,5,0};
        int maxProduct = findMaximumProductOfSubArray(arr);
        System.out.println(maxProduct);
    }

    private static int findMaximumProductOfSubArray(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        int result =max;

        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int temp = Math.min(current,Math.min(max*current,min*current));
            max = Math.max(current,Math.max(min*current,max*current));
            min = temp;
            result=Math.max(max,result);
        }

        return result;
    }
}
