package HomeWork1;

import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя:");

        Scanner a = new Scanner(System.in);
        String name = a.next();

        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
     }
}
