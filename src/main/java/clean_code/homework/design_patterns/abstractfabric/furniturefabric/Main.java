package clean_code.homework.design_patterns.abstractfabric.furniturefabric;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory;

        String furnitureType = "Modern";

        if ("Modern".equals(furnitureType)) {
            furnitureFactory = new ModernFurnitureFactory();
        } else {
            furnitureFactory = new ClassicFurnitureFactory();
        }

        furnitureFactory.createChair().create();
        furnitureFactory.createTable().create();
    }
}