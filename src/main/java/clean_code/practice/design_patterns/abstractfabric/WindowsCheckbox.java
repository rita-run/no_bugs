package clean_code.practice.design_patterns.abstractfabric;

class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Render a Windows checkbox.");
    }
}