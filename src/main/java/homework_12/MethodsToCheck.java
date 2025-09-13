package homework_12;

import java.util.Arrays;

public class MethodsToCheck {
    //this method checks if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public int findSecondMax(int[] numbers) {
        //there is a bug here because
        //first we call the .distinct() method to create a array of distinct values
        //but then call .skip() and manipulate with the initial numbers array
        //so it doesn't make sense
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }

    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}