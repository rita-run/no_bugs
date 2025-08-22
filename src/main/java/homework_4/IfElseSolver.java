package homework_4;

import java.util.Scanner;

public class IfElseSolver {
    public static void main(String[] args) {
        /*System.out.println(defineNumberType());
        System.out.println(defineNumberType());
        System.out.println(defineNumberType());

        //System.out.println(findGreaterNumber());

        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        System.out.println(defineGrade(grade));


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(checkNumberParity(number));

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(defineDiscount(age));
*/
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();
        System.out.println(defineGradeByPoints(points));

    }

    public static String defineNumberType() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String numberType = "";

        if (i > 0) {
            numberType = "The number is positive";
        }
        if (i < 0) {
            numberType = "The number is negative";
        }
        if (i == 0) {
            numberType = "The number is zero";
        }
        return numberType;
    }

    public static int findGreaterNumber() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result = 0;

        if (firstNumber > secondNumber) {
            result = firstNumber;
        }
        if (firstNumber < secondNumber) {
            result = secondNumber;
        }
        if (firstNumber == secondNumber) {
            System.out.println("None of the numbers are greater, they are equal!");
        }
        return result;
    }

    public static String defineGrade(int grade) {
        if (grade == 5) {
            return "Excellent!";
        } else if (grade == 4) {
            return "Good!";
        } else if (grade == 3) {
            return "Satisfactory";
        } else if (grade == 2 || grade == 1) {
            return "Non satisfactory";
        } else
            return "Enter the grade (1 to 5)";
        }

    public static String checkNumberParity(int number) {
        if (number % 2 == 0) {
            return "The number is even";
        } else
            return "The number is odd";
    }

    public static String defineDiscount(int age) {
        if (age < 18) {
            return "Your discount is 25%";
        } else if (age >= 65) {
            return "Your discount is 30%";
        }
        return "You do not have any discount";
    }

    public static String defineGradeByPoints(int points) {
        if (points > 100 || points < 0) {
            return "Enter the grade (0 to 100)";
        } else if (points >= 90) {
            return "Excellent!";
        } else if (points >= 75) {
            return "Good!";
        } else if (points >= 60) {
            return "Satisfactory";
        } return "Non satisfactory";
        }
}


