package workbook.exceptions;

public class Main {
    public static void main(String[] args) {
        //Исключение при пустом списке
        // Проверка на пустоту с выбросом исключения.

        ListManager listManager = new ListManager();

        listManager.deleteFirstElement();
        
    }

}
