package ComparableAndComparator.exc1;

import ComparableAndComparator.Comparator.SortNumberAscending;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

interface CompareModule {
    int compareNumbers(int first, int second);
}

public class RandomNumberSorting {
    Random random = new Random();
    private int counter = 0;

    private Integer[] numbersToSort = new Integer[20];

    private void fillList() {
        while (counter != 20) {
            numbersToSort[counter] = random.nextInt(100);
            counter++;
        }
    }

    public void sortListAscending() {
        fillList();
        Integer[] sortedList = Arrays.copyOf(numbersToSort, numbersToSort.length);
        Arrays.sort(sortedList, new SortNumberAscending());
        System.out.println(Arrays.toString(sortedList));
    }

    public void sortListDescending() {
        fillList();
        Integer[] sortedList = Arrays.copyOf(numbersToSort, numbersToSort.length);
//        Arrays.sort(sortedList, new SortNumberDescending());
        Arrays.sort(sortedList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1.compareTo(o2));
            }
        });
        System.out.println(Arrays.toString(sortedList));
    }


}
