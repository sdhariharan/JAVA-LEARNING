public class MaxMinArray {
    public static void main(String[] args) {

        int[] arr = {5, 9, 2, 11, 3};

        int max = arr[0];
        int min = arr[0];

        for(int x : arr) {
            if(x > max) max = x;
            if(x < min) min = x;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}

