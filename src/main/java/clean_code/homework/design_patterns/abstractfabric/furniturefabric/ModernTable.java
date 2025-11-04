package clean_code.homework.design_patterns.abstractfabric.furniturefabric;

public class ModernTable implements Table {
    @Override
    public void create() {
        System.out.println("Create a modern table");
    }
}