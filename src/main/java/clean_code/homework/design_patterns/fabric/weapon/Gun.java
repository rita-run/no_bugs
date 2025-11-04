package clean_code.homework.design_patterns.fabric.weapon;

public class Gun extends Weapon {
    @Override
    void use() {
        System.out.println("Shooting bullets");
    }
}