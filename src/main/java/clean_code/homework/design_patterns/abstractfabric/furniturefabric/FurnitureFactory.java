package clean_code.homework.design_patterns.abstractfabric.furniturefabric;

//abstract factory
public interface FurnitureFactory {
    Table createTable();
    Chair createChair();
}