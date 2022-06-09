
import java.sql.SQLOutput;
import
java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // присвоение значения массиву
        int[] arr = generateRandomArray();
        // Задача 1
        // Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        // в формате: «Сумма трат за месяц составила … рублей».
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

    //Задача 2
    //найти минимальную и максимальную трату за день.
    //Вывести в консоль результат в формате: «Минимальная сумма трат за день составила … рублей.
    // Максимальная сумма трат за день составила … рублей».

        int maxNum = arr [0];
        int minNum = arr [0];
       for (int i = 0; i < arr.length; i++) {
           if (arr [i] < minNum) {
               minNum = arr [i];
           }
           if (arr [i] > maxNum) {
               maxNum = arr [i];
           }
       }
        System.out.println("Минимальная сумма затрат за день составила " + minNum + " рублей. " +
                "\nМаксимальная сумма затрат за день составила " + maxNum + " рублей.");


    //Задача 3
    //Расчет среднего значения трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
    //и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
    //Подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).

        double average = 0;
        average = sum / arr.length;

        System.out.println("\nСредняя сумма трат за месяц составила " + average + " рублей\n");

    //Задача 4
    //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
    // В качестве данных для массива используйте:
    //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    //В результате в консоль должно быть выведено "Ivanov Ivan". Дополнительные массивы не используются.

    } public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
