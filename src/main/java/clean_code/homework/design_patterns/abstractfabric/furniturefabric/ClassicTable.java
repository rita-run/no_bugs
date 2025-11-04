package clean_code.homework.design_patterns.abstractfabric.furniturefabric;

public class ClassicTable implements Table {
    @Override
    public void create() {
        System.out.println("Create a classic table");
    }
}