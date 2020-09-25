package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя:");

        Scanner a = new Scanner(System.in);
        String name = a.next();
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if (Objects.equals(name, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
