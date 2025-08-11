public class HelloWorld {
    //поля
    static int a = 1;


    //метод
    public static void main(String[] args) {
        int sum1 = sum(1, 2);
        System.out.println(sum1);

        int mult1 = multiply(3, 2);
        System.out.println("Результат умножения: " + mult1);

        int subs1 = substruct(10, 3);
        System.out.println("Результат вычитания: " + subs1);

        double dev1 = divide(3, 2);
        System.out.println("Результат деления: " + dev1);
    }

    public static int sum(int x, int y) {
        //тело метода
        return x + y;
    }

    public static int multiply(int p, int k) {
        //тело метода
        int mult = p * k; //создала переменную, присвоила значение равное результату умножения p и k
        return mult;
    }

    public static int substruct(int g, int l) {
        return g - l;
    }

    //возвращаемый тип данных целое или нет?
    public static double divide(int s, int h) {
        return (double) s / h;
    }
}
