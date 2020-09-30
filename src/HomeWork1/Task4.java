package HomeWork1;

public class Task4 {
    public static void main(String[] args) {
        if (sleepIn(true, false)) {
            System.out.println("Спим дальше!");
        } else {
            System.out.println("Подъем");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
