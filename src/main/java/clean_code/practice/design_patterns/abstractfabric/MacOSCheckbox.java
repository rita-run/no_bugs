package clean_code.practice.design_patterns.abstractfabric;

class MacOSCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Render a MacOS checkbox.");
    }
}
