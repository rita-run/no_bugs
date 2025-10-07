package livecoding_leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    //Поиск частоты слов в строке
    //Подсчитать, сколько раз каждое слово встречается в строке.
    //cat: 4
    //dog: 3
    //bird: 2
    //mouse: 1
    //tree: 1
    //we can create a hashmap where the key is the word, and the number
    //of appearances is the value
    //to do so we need to separate the string to words (= substrings) and put them to a list
    public static void main(String[] args) {
        String text = "cat dog bird dog cat cat mouse dog tree bird cat";
        String[] arrayOfWords = text.split("[\\s,;]+");
        List<String> listOfWords = Arrays.asList(arrayOfWords);
        Map<String, Long> map = listOfWords.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(map);
    }
}