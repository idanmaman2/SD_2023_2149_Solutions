package Test2022AB;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//Question 1
public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("idan" , "Maman" , "hello" , "hello123" , "cool123" , "z1", "z1", "z1", "z1", "z1", "z1", "z1", "z1", "z1", "z1", "z1", "z1", "z1", "z1", "z1", "z1", "z1");
        String sol1 =String.join(" ",  words.stream().sorted(Comparator.comparing(String::length).reversed()).limit(10).toList()) ;
        String sol2 =  words.stream().sorted(Comparator.comparing(String::length).reversed()).limit(10).collect(Collectors.joining(" "));
        System.out.println(sol1);
        System.out.println(sol2);
    }
    
}