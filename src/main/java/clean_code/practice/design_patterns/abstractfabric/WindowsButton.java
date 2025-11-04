package clean_code.practice.design_patterns.abstractfabric;

class WindowsButton implements Button {
    public void paint() {
        System.out.println("Render a Windows button.");
    }
}