package clean_code.homework.design_patterns.abstractfabric.graphicelements;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a Windows button.");
    }
}