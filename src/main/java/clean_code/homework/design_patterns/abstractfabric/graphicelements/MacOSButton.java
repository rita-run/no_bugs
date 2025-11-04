package clean_code.homework.design_patterns.abstractfabric.graphicelements;

class MacOSButton implements Button {
    public void paint() {
        System.out.println("Render a MacOS button.");
    }
}