package clean_code.practice.design_patterns.abstractfabric;

//abstract factory
public interface GUIFactory {
    Button createButton(); //fabric method
    Checkbox createCheckbox(); //fabric method
}