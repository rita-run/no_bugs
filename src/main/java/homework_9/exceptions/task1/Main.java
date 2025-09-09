package homework_9.exceptions.task1;

public class Main {
    public static void main(String[] args) {
        //1. Обработка проверяемого исключения
        //Условие задачи:
        //Напишите программу, которая пытается открыть файл с именем "data.txt". Если файл не найден,
        // программа должна обработать исключение и вывести сообщение: "Файл не найден".

        FileOpener fileOpener = new FileOpener();
        fileOpener.setFile("/home/rita/IdeaProjects/first-project/src/data.txt");
        fileOpener.openFile();

        fileOpener.setFile("/home/rita/IdeaProjects/first-project/src/invalid_data.txt");
        fileOpener.openFile();


    }
}
