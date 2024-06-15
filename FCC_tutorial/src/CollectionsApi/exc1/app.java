package CollectionsApi.exc1;

import Files.BufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class app {
    public static void main(String[] args) {
        String fileName = "/Users/marcinochmanski/Desktop/java/java_start/java_start/FCC_tutorial/src/CollectionsApi/exc1/input.txt";
        FileReader fileReader;
        BufferedReader bufferedReader;

        try{
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);


            List<String> list = bufferedReader.lines()
                    .map(line -> line.replace(",", ""))
                    .map(line -> line.replace(".", ""))
                    .map(line -> line.split(" "))
                    .flatMap(Arrays::stream)
                    .toList();
            bufferedReader.close();

//            System.out.println(list.toString());

            long wordksWithFiveLetters = list.stream()
                    .filter(word -> word.length() == 5)
                    .count();
            long wordsStartingWithS = list.stream()
                    .filter(word -> word.startsWith("s"))
                    .count();
            System.out.println("5 liter: " + wordksWithFiveLetters);
            System.out.println("od s: " + wordsStartingWithS);

        } catch (Exception e) {

        }
    }
}
