package clean_code.homework.design_patterns.fabric.weapon;

public class BladedWeapons extends WeaponUsage {
    @Override
    Weapon createWeapon() {
        return new Sword();
    }
}