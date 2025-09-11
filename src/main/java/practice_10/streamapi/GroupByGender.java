package practice_10.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGender {
    //List of strings with names and genders "John: M", "Sarah: F"
    //group by gender in map Map<String, List<String>;
                            //    gender -   names' list
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John:M", "Sarah:F", "Sasha:F", "Nick:M");

        Map<String, List<String>> groupedByGender = names.stream()
                .collect(Collectors.groupingBy(name -> {
                            System.out.println("key before transformation: " + name);
                            System.out.println("key after transformation: " + name.split(":")[1]);
                    return name.split(":")[1]; },
                        Collectors.mapping(name ->
                        {
                            System.out.println("Value before transformation: " + name);
                            System.out.println("Value after transformation: " + name.split(":")[0]);
                            return name.split(":")[0];}
                                , Collectors.toList())));

        System.out.println(groupedByGender);
    }

}
