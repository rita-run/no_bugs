package homework_4;

import java.util.Scanner;

public class SwitchSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println(defineDayByNumber(Week.MONDAY));

        //int day = scanner.nextInt();
        //System.out.println(defineTicketPrice(scanner.nextInt()));

        //int number = scanner.nextInt();
        //System.out.println(defineLetterByNumber(number));

        //String command = scanner.nextLine();
        //System.out.println(defineMessageByCommand(command));

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the operator: ");
        String operator = scanner.nextLine();
        System.out.println(simpleCalculator(num1, num2, operator));
    }

    public static String defineDayByNumber(Week week) {
        String dayDescription = "";

        switch (week) {
            case MONDAY -> dayDescription = "It's MONDAY";
            case TUESDAY -> dayDescription = "It's TUESDAY";
            case WEDNESDAY -> dayDescription = "It's WEDNESDAY";
            case THURSDAY -> dayDescription = "It's THURSDAY";
            case FRIDAY -> dayDescription = "It's FRIDAY";
            case SATURDAY -> dayDescription = "It's SATURDAY";
            case SUNDAY -> dayDescription = "It's SUNDAY";
        }
        return dayDescription;
    }

    public static String defineTicketPrice(int day) {
        String price = "";
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                price = "Price is 300 rubles";
                break;
            case 6:
            case 7:
                price = "Price is 450 rubles";
                break;
            default:
                price = "Enter number of a day (1-7)";
        }
        return price;
    }

    public static String defineLetterByNumber(int number) {
        if (number <= 100 && number >= 90) {
            return "A";
        } else if (number >= 80) {
            return "B";
        } else if (number >= 70) {
            return "C";
        } else if (number >= 60) {
            return "D";
        } else
            return "F";
    }

    public static String defineMessageByCommand(String command) {
        String message = "";
        switch (command) {
            case "start":
                message = "System is started";
                break;
            case "stop":
                message = "System is stopped";
                break;
            case "restart":
                message = "System is restarted";
                break;
            case "status":
                message = "System is working";
                break;
            default:
                message = "Enter a command";
        }
        return message;
    }

    public static double simpleCalculator(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("You can't divide by zero!");
                    return Double.NaN;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Non existing operator");
        }

        return result;
    }


}
