package Typy_opakowujace.exc2;

public class app {
    public static void main(String[] args){
        String input = "Lorem Ipsum jest standardem od późnego średniowiecza. " +
                "Malarz będzie miał mieszane fragmenty tekstu w książce wzór i jest ten tekst, że używamy dzisiaj. " +
                "Inna wersja mówi, że jest 45432321090932 to fragment z książki Cycerona: \"\" De finibus bonorum i Malorum \"\" działy " +
                ". Ta książka, bardzo popularna w okresie renesansu, jest rozprawa na temat etyki.";

        WordMapper wordMapper = new WordMapper();
        wordMapper.getMapping(input);
    }
}
