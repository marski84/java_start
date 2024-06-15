package StreamApi;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class app {
    public static void main(String[] args) {
//        Stream<Integer> intStream = Stream.of(1,2,3,4,5, 6);
//        intStream
//                .filter(number -> number % 2 == 0)
//                .map(number -> number * 2)
//                .forEach(System.out::println);
//
//        String [] words = Stream.of("hello", "world")
//                .map(String::toUpperCase)
//                .toArray(String[]::new);
//        System.out.println(words);

//        terminal
        Stream<Course> courses = Stream.of(
                new Course(3L, "Java", 199, "Programowanie"),
                new Course(1L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(2L, "Tajniki Google", 299, "Marketing")
        );

        Stream<Course> courses2 = Stream.of(
                new Course(3L, "Java", 199, "Programowanie"),
                new Course(1L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(2L, "Tajniki Google", 299, "Marketing")
        );

//        courses.forEach(System.out::println);
//        long elements = courses.count();
//        List sortedStream = courses.sorted((a, b) -> a.getId().compareTo(b.getId())).toList();

//        System.out.println(
//                courses.sorted((a, b) -> Double.compare(a.getPrice(),b.getPrice()))
//                        .toList()
//        );
//
//        System.out.println(
//                courses.anyMatch(c -> c.getPrice() <99)
//        );

//        List list = courses.collect(
//                ArrayList::new,
//                ArrayList::add,
//                ArrayList::addAll
//        );
//
//        System.out.println(list );

        Stream<List<Course>> coursesAll = Stream.of(courses.toList(), courses2.toList());
//
//        coursesAll
//                .flatMap(Collection::stream)
//                .forEach(System.out::println);


//        List<Integer> collect = IntStream.iterate(0, i -> i + 1)
//                .limit(100)
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(collect);


        List<Course> coursesWithDuplicates = new ArrayList<>();
        coursesWithDuplicates.add(new Course(3L, "Java", 199, "Programowanie"));
        coursesWithDuplicates.add(new Course(1L, "Sztuka pisania", 99, "Rozwój osobisty"));
        coursesWithDuplicates.add(new Course(2L, "Tajniki Google", 299, "Marketing"));
        coursesWithDuplicates.add(new Course(3L, "Java", 199, "Programowanie"));
        coursesWithDuplicates.add(new Course(1L, "Sztuka pisania", 99, "Rozwój osobisty"));
        coursesWithDuplicates.add(new Course(2L, "Tajniki Google", 299, "Marketing"));
        coursesWithDuplicates.add(new Course(2L, "Tajniki Java", 500, "Marketing"));

        coursesWithDuplicates.stream()
//                .peek(System.out::println)
//                .map(Course::getName)
//                .filter(name -> name.getName().toLowerCase().equals("java"))
                .sorted((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()))
//                .distinct()
                .forEach(System.out::println);


    }


}
