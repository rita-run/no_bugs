package clean_code.homework.design_patterns.abstractfabric.graphicelements;

public class MacOSWindow implements Window {
    @Override
    public void paint() {
        System.out.println("Render a MacOS window");
    }
}