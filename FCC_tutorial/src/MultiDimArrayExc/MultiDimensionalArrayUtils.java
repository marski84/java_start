package MultiDimArrayExc;

public class MultiDimensionalArrayUtils {

    private double[][] multiDimArr= new double[3][3];
    MultiDimensionalArrayUtils() {

    }

    public double sum(double[][] arr) {
       double first = arr[0][0] * arr[1][1] * arr[2][2];
       double second =  arr[0][2] * arr[1][1] * arr[2][0];

       return first + second;
    }

    public double sumOfMultiply(double[][] arr) {
        double middleRow = arr[1][0] + arr[1][1] + arr[1][2];
        double middleColumn = arr[0][1] + arr[1][1] + arr[2][1];
        return middleRow * middleColumn;
    }

    public double edgeSum(double[][] arr) {
        return arr[0][0] + arr[1][2] + arr[2][0] + arr[2][2];
    }
}
