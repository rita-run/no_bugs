package homework_13;

public class DebugTask4 {
//    Задача 4:
//    Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.
    public static void main(String[] args) {
        System.out.println(isPalindrome("null"));
    }
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}