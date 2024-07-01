package org.gopal.Blind75;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] productOfArrayExceptSelf = getProductOfArrayExceptSelf(new int[]{2,3,4,5});
        String productOfArray = Arrays.toString(productOfArrayExceptSelf);
        System.out.println(productOfArray);
    }

    private static int[] getProductOfArrayExceptSelf(int[] arr) {
        int[] result = new int[arr.length];
        int prefix =1,postfix = 1;
        for(int i=0;i<arr.length;i++){
            result[i]=prefix;
            prefix = arr[i]*prefix;
        }
        for(int i = arr.length-1;i>=0;i--){
            result[i]=result[i]*postfix;
            postfix=arr[i]*postfix;
        }
        return result;
    }
}
