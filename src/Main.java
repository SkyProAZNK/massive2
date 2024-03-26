import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] book = generateRandomArray();
        System.out.println("Сгенерировали массив: " + Arrays.toString(book));

        System.out.println("Задача 1");
        int sum = 0;
        for (int expense : book) {
            sum += expense;
        }
        System.out.println("Сумма трат за месяц составляет " + sum + " рублей");


        System.out.println("задача 2");

        int min = book[0];
        int max = book[0];
        for (int i : book) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");

        System.out.println("задача 3");

        double avg = sum / book.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей.");

        System.out.println("задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}