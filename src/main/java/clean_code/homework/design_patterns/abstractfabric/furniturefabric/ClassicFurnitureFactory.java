package clean_code.homework.design_patterns.abstractfabric.furniturefabric;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Table createTable() {
        return new ClassicTable();
    }

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }
}