package clean_code.homework.design_patterns.abstractfabric.graphicelements;

public interface GUIFactory {
    Button createButton(); //fabric method
    Window createWindow(); //fabric method
    Menu createMenu(); //fabric method
}