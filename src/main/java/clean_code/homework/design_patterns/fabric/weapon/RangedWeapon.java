package clean_code.homework.design_patterns.fabric.weapon;

public class RangedWeapon extends WeaponUsage {
    @Override
    Weapon createWeapon() {
        return new Bow();
    }
}