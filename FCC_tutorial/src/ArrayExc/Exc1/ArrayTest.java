package ArrayExc.Exc1;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayCalc arrayCalc = new ArrayCalc();

        int[] firstArr = {5,6,7};
        int[] secondArr = {1,1,1};
        System.out.println(arrayCalc.calculateArraySum(firstArr, secondArr));


    }
}
