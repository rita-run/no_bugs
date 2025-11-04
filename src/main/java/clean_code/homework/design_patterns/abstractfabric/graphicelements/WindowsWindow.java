package clean_code.homework.design_patterns.abstractfabric.graphicelements;

public class WindowsWindow implements Window {
    @Override
    public void paint() {
        System.out.println("Render a Windows window");
    }
}
