package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя:");
        boolean isPrinted = false;
        Scanner a = new Scanner(System.in);
        String name = a.next();
        if (Objects.equals(name, "Вася")) {
            isPrinted = true;
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(name, "Анастасия")) {
            isPrinted = true;
            System.out.println("Я тебя так долго ждал");
        }
        if (!isPrinted){
            System.out.println("Добрый день, а вы кто?");
        }
    }
}