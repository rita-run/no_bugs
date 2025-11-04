package clean_code.homework.design_patterns.abstractfabric.furniturefabric;

public class ClassicChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create a classic chair");
    }
}