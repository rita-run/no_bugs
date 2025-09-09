package homework_9.exceptions.task1;

import java.io.FileReader;
import java.io.IOException;

public class FileOpener {
    //1. Обработка проверяемого исключения
    //Условие задачи:
    //Напишите программу, которая пытается открыть файл с именем "data.txt". Если файл не найден,
    // программа должна обработать исключение и вывести сообщение: "Файл не найден".
    private String file;

    public void setFile(String file) {
        this.file = file;
    }

    public void openFile() {
        try(FileReader fileReader = new FileReader(this.file)) {
            System.out.println("File is opened");
        } catch (IOException e) {
            System.out.println("File is not found");
        }
    }
}
