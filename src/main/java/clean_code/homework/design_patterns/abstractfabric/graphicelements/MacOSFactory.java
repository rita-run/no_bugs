package clean_code.homework.design_patterns.abstractfabric.graphicelements;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }
}