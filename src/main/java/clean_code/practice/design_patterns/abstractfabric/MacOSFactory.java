package clean_code.practice.design_patterns.abstractfabric;

public class MacOSFactory implements GUIFactory {
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}