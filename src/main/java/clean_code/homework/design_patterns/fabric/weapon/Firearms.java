package clean_code.homework.design_patterns.fabric.weapon;

public class Firearms extends WeaponUsage {
    @Override
    Weapon createWeapon() {
        return new Gun();
    }
}