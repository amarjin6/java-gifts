package task_4;

import java.util.ArrayList;

public class FindPrimeNumbers {
    private static boolean isPrimeNumber(int x)
    {
        if(x == 1 || x <= 0)
            return false;

        for(int d = 2; d * d <= x ; d++){

            if(x % d == 0)
                return false;
        }
        return true;

    }

    public  static int[] findSimpleNumbers(int[] arr) {
        boolean flag;
        ArrayList<Integer> indexList = new ArrayList<Integer>();
        if (arr == null) {
            throw new IllegalArgumentException("Array shouldn't be null!");
        }

        for (int i =0 ;i<arr.length; i++)
        {
            flag = isPrimeNumber(arr[i]);
            if (flag) {
                indexList.add(i);
            }
        }

        if (indexList.isEmpty()) {
            throw new IllegalArgumentException("No prime numbers in array!");
        }
        int[] mas = ReturnMas(indexList);
        return mas;
    }

    private  static int[] ReturnMas(ArrayList<Integer> list) {
        int[] mas = new int[list.size()];
        int count = 0;
        for(int value: list) {
            mas[count] = value;
            count++;
        }
        return mas;
    }
}
