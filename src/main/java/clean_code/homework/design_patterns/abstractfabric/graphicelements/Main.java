package clean_code.homework.design_patterns.abstractfabric.graphicelements;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;

        String osType = "MacOS";

        if ("MacOS".equals(osType)) {
            guiFactory = new MacOSFactory();
        } else {
            guiFactory = new WindowsFactory();
        }

        guiFactory.createButton().paint();
        guiFactory.createWindow().paint();
        guiFactory.createMenu().paint();
    }
}