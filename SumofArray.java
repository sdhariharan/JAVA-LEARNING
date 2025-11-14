public class SumofArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int sum = 0;

        for(int x : arr) {
            sum += x;
        }

        System.out.println("Sum = " + sum);
    }
}

