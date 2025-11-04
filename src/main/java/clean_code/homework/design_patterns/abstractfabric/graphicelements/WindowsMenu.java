package clean_code.homework.design_patterns.abstractfabric.graphicelements;

public class WindowsMenu implements Menu {
    @Override
    public void paint() {
        System.out.println("Render a Windows Menu");
    }
}