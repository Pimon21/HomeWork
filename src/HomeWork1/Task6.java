package HomeWork1;

public class Task6 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(createPhoneNumber(arr));

    }

    public static String createPhoneNumber(int[] args){
        String result = "(";

        for (int i = 0; i < args.length; i++) {
            result = result + args[i];

            if (i == 2) {
                result = result + ") ";
            }

            if (i == 5) {
                result = result + "-";
            }
        }

        return result;
    }
}

