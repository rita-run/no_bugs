package clean_code.homework.design_patterns.abstractfabric.graphicelements;

public class MacOSMenu implements Menu {
    @Override
    public void paint() {
        System.out.println("Render a MacOS menu");
    }
}