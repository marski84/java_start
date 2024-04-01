package ArrayExc.Exc1;

public class ArrayCalc {
    public ArrayCalc() {
    }

    public int calculateArraySum(int[] arr1, int [] arr2) {
        int sum = 0;
        for (int number : arr1) {
            sum += number;
        };

        for (int number: arr2) {
            sum += number;
        }

        return sum;
    }
}
