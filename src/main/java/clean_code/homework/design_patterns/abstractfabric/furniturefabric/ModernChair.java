package clean_code.homework.design_patterns.abstractfabric.furniturefabric;

public class ModernChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create a modern chair");
    }
}