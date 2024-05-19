package BubbleSorting;

public class BubbleSorting {

    Sortable sortable = new Sortable() {
        @Override
        public double[] sort(double[] arrayToSort) {
            double temp = 0;  //  temporary element for swapping
            int counter = 0;  //  element to count quantity of steps

            for (int i = 0; i < arrayToSort.length; i++) {
                counter = i + 1;
                for (int j = 1; j < (arrayToSort.length - i); j++) {

                    if (arrayToSort[j - 1] > arrayToSort[j]) {
                        temp = arrayToSort[j - 1];
                        arrayToSort[j - 1] = arrayToSort[j];
                        arrayToSort[j] = temp;
                    }
                }
            }
            System.out.println("Steps quantity, non optimized = " + counter);
            for (double number : arrayToSort) {
                System.out.println(number);
            }
            return arrayToSort;
        }
        };
    };


