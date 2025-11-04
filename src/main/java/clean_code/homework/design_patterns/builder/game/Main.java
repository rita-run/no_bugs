package clean_code.homework.design_patterns.builder.game;

public class Main {
    public static void main(String[] args) {
        Character character = new Character("Medium", "Low", "Sword", "Magic");

        Character flexibleCharacter = new Character.Builder()
                .setMagic("Super magic")
                .setArmor("Bow")
                .build();

        System.out.println(character);
        System.out.println(flexibleCharacter);
    }
}