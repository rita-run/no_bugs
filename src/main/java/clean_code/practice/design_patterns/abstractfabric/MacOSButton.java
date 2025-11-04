package clean_code.practice.design_patterns.abstractfabric;

class MacOSButton implements Button {
    public void paint() {
        System.out.println("Render a MacOS button.");
    }
}
