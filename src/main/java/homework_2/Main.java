package homework_2;

public class Main {
    static public void main(String[] args) {
        Car toyota = new Car("Toyota", 10);
        toyota.setYear(15);
        toyota.setYear(2);
        toyota.print();

        Rectangle rectangle = new Rectangle(5, 25);
        rectangle.print();
        rectangle.setWidth(10);
        rectangle.print();
        rectangle.setWidth(10000);
        rectangle.print();

        Book book = new Book("Book", "Author");
        book.setAuthor("New one");
        book.setAuthor("Nabokov");
        book.printInfo();

        BankAccount myAccount = new BankAccount("Petya", 100.0);
        myAccount.deposit(100.0);
        myAccount.withdraw(50.0);
        myAccount.printBalance();

        Point point = new Point(3, 5);
        point.setX(10);
        point.print();

        StudentGroup my_group = new StudentGroup("My Group", 10);
        my_group.setGroupCount(20);
        my_group.printInfo();

        Circle circle = new Circle(25);
        circle.setRadius(70);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());

        Teacher teacher = new Teacher("Maria", "Math");
        teacher.setSubject("History");
        teacher.printInfo();

        Product product = new Product("book", 100);
        product.applyDiscount(10);
        product.printInfo();

        Laptop laptop = new Laptop("Apple", 10000.00);
        laptop.setPrice(5000.00);
        laptop.printInfo();


    }
}
