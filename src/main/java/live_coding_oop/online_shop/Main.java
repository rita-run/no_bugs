package live_coding_oop.online_shop;

public class Main {
    /*
    Product (base price)
    Electronic product (price + VAT 20%)
    Food product (price + VAT 10% - discount 5%)
    Digital product (price - discount 15%)

    Manager? (adds a product to a cart, prints the price)
     */
    public static void main(String[] args) {
        ElectronicProduct fridge = new ElectronicProduct("Fridge", 500);
        DigitalProduct image = new DigitalProduct("Photo", 100);
        FoodProduct bread = new FoodProduct("Bread", 10);

        Manager manager = new Manager(fridge);
        System.out.println(manager.addProduct());
        System.out.println(manager.printPrice());

        Manager manager2 = new Manager(image);
        System.out.println(manager2.addProduct());
        System.out.println(manager2.printPrice());


        Manager manager3 = new Manager(bread);
        System.out.println(manager3.addProduct());
        System.out.println(manager3.printPrice());
    }
}