package clean_code.homework.design_patterns.fabric.weapon;

abstract class WeaponUsage {
    //fabric method
    //implements a way to create a weapon
    abstract Weapon createWeapon();

    public void useWeapon() {
        Weapon weapon = createWeapon();
        weapon.use();
    }
}