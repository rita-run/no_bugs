package clean_code.homework.design_patterns.fabric.weapon;

public class Main {
    /*
    В этой задаче нам нужно создать систему для создания различных видов оружия в игре
    (например, мечи, луки и пистолеты). Все оружие будет иметь общий интерфейс,
    но конкретные реализации оружия будут различаться. Мы будем использовать фабричный метод,
    чтобы централизованно создавать объекты оружия.
     */
    public static void main(String[] args) {
        WeaponUsage weaponUsage;

        String weaponType = "gun";

        if ("gun".equals(weaponType)) {
            weaponUsage = new Firearms();
        } else if ("bow".equals(weaponType)) {
            weaponUsage = new RangedWeapon();
        } else {
            weaponUsage = new BladedWeapons();
        }

        weaponUsage.useWeapon();
    }
}