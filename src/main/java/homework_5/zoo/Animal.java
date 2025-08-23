package homework_5.zoo;

public class Animal {
    private final String behavior;

    public Animal(String behavior) {
        this.behavior = behavior;
    }

    public String getBehavior() {
        return behavior;
    }

    public void showBehavior() {
        System.out.println(getBehavior());
    }
}
