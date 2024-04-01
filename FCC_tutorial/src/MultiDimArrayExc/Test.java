package MultiDimArrayExc;

public class Test {
    public static void main(String[] args) {
        MultiDimensionalArrayUtils dimensionalArray = new MultiDimensionalArrayUtils();
        double[][] arr = new double[3][];
        double[] line0 = {1.0, 1.5, 2.0};
        double[] line1 = {1.5, 2.0, 2.5};
        double[] line2 = {2.0, 2.5, 3.0};

        arr[0] = line0;
        arr[1] = line1;
        arr[2] = line2;

        System.out.println(dimensionalArray.sum(arr));
        System.out.println(dimensionalArray.sumOfMultiply(arr));
        System.out.println(dimensionalArray.edgeSum(arr));


    }
}
