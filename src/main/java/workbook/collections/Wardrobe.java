package workbook.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Wardrobe {
    private ArrayList<String> wardrobe;

    public Wardrobe() {
        this.wardrobe = new ArrayList<>();
    }

    private void addPeaceOfClothes(String peaceOfClothes) {
        wardrobe.add(peaceOfClothes);
    }

    public void getPeaceOfClothesFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name of clothes you want to add to your wardrobe (to exit enter 'exit'): ");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            } addPeaceOfClothes(input);
        }
    }

    public void printClothesList() {
        System.out.println("There is all your clothes: ");

        for (int i = 0; i < wardrobe.size(); i++) {
            System.out.println((i +1) + "." + wardrobe.get(i));
        }
    }

}
