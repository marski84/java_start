package Collections;
import java.util.*;

public class Lotto {
    private Scanner sc = new Scanner(System.in);
    private List<Integer> numbers = new ArrayList<Integer>();



    public void init() {
//        getUserNumbers();
        Random random = new Random();
        checkResults(List.of(random.nextInt(49), random.nextInt(49), random.nextInt(49),
                random.nextInt(49), random.nextInt(49), random.nextInt(49)));
    }

    private void getUserNumbers() {
        if(numbers.size() != 6) {
            System.out.println("please input a number");
            String userInput = sc.nextLine();
            if(validateInput(userInput)) {
                numbers.add(Integer.valueOf(userInput));
                System.out.println(numbers);
                getUserNumbers();
            } else {
                System.out.println("Not a valid number");
                getUserNumbers();
            }
        }
    }

    private List<Integer> generate() {
        List randomNumbers = new ArrayList<Integer>();
        for(int i = 0; i < 50; i++) {
            randomNumbers.add(i + 1);
        }
        Collections.shuffle(randomNumbers);
        return randomNumbers;
    }

    private void checkResults(List<Integer> userNumberList) {
        List<Integer> drawingResultNumbers = generate();
        List<Integer> drawResultList = drawingResultNumbers.subList(0, 6);
        List<Integer> checkedNumbers = new ArrayList<Integer>();


        userNumberList.stream().forEach(number -> {
            if (drawResultList.contains(number)) {
                checkedNumbers.add(number);
            }
        });
        System.out.println(userNumberList);
        System.out.println(drawResultList);
        System.out.println("Wybrane liczby: " + userNumberList);
        System.out.println("Liczby trafień: " + checkedNumbers.size());
        System.out.println("Liczby trafione: " + checkedNumbers);
}

    private boolean validateInput(String input) {
        String regex = "\\d+";
        return input.matches(regex);
    }
}
