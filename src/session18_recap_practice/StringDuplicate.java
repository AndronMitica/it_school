package session18_recap_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StringDuplicate {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "apple", "plum", "orange");
        System.out.println(countStringDuplicates(list));
    }

    private static HashMap<String, Long> countStringDuplicates(List<String> input) {
        HashMap<String, Long> wordFrequencyMap = (HashMap<String, Long>) input.stream()
                .collect(Collectors.groupingBy(str -> str.toLowerCase(), Collectors.counting()));
        return wordFrequencyMap;
    }
}