package org.gopal.Blind75;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {-4,-2,5,-1,3,1,-6,5};
        int max = findMaxSubArrayValue(arr);
        System.out.println(max);
    }

    private static int findMaxSubArrayValue(int[] arr) {
        int current=0;
        int max=arr[0];
        for(int i : arr){
            current+=i;
            if(current<0){
                current=0;
            }
            max = Math.max(current,max);
        }

        return max;
    }
}
