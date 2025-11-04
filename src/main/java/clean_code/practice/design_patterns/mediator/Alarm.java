package clean_code.practice.design_patterns.mediator;

class Alarm {
    private Mediator mediator;

    public void activate() {
        System.out.println("Alarm activated");
    }

    public void deactivate() {
        System.out.println("Alarm deactivated");
    }

    public void alarm() {
        mediator.notify(this, "evening");
    }
}