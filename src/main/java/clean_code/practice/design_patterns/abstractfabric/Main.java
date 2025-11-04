package clean_code.practice.design_patterns.abstractfabric;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;

        String osType = "Windows";

        if ("Windows".equals(osType)) {
            guiFactory = new WindowsFactory();
        } else {
            guiFactory = new MacOSFactory();
        }

        guiFactory.createButton().paint();
        guiFactory.createCheckbox().paint();
    }
}