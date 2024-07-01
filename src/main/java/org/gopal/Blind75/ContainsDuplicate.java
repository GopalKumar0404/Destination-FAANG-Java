package org.gopal.Blind75;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Boolean value = checkDuplicates(new int[]{5,7,8,9,2,3,1,1});
        System.out.println(value);
    }

    private static Boolean checkDuplicates(int[] arr) {
        Set<Integer> arrayValue = new HashSet<>();
        for(int value : arr)
            if(!arrayValue.add(value))
                return true;
        return false;
    }
}
