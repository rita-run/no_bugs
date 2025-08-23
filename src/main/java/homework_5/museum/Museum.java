package homework_5.museum;

public class Museum {
    private Showpiece showpiece;

    public void addShowpiece(Showpiece showpiece) {
        this.showpiece = showpiece;
    }

    public void removeShowpiece() {
        this.showpiece = null;
    }

    public void provideCare() {
        System.out.println("Name: " + this.showpiece.getName() + ", provide care: " + this.showpiece.getCare());
    }

    public void printInfo() {
        System.out.println("Name: " + this.showpiece.getName() + ", description: " + this.showpiece.getDescription());
    }
}
