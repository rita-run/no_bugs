package homework_5.restaurant;

public class Restaurant {
    /*3. Управление рестораном
Условие:
В меню ресторана добавляется блюдо.
У каждого блюда свои параметры отображения:
Горячее блюдо — с температурой
Напиток — с объёмом
Нужно спроектировать систему, в которой можно
добавлять блюда и выводить их описание с учётом характеристик.

Actions: add dish
print description of the dish

     */

    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
        System.out.println("New dish is added");
    }

    public void removeDish(Dish dish) {
        System.out.println("Dish is removed");
        this.dish = null;
    }

    public void printDishDescription() {
        //Name: chimken, description: very good , temperature: 50 degrees
        //Name: coffee, description: very creamy, volume: 200 ml
        //Name: salad, description: very tasty
        System.out.println(dish.getDescription());
    }
}
