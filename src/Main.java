import java.util.Arrays;

public class Main {
    //Задача №1
    static double sum(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0!");
            return Double.NaN;
        }
    }

    //Задача № 2.1 .  You need to double the integer and return it.
    static int doubleInteger(int i) {
        // Double the integer and return it!
        i = i * i;
        return i;
    }

    //Задача № 2.2. Тимми и Сара думают,
    // что они влюблены, но в том месте,
    // где они живут, они узнают об этом только
    // тогда, когда каждый из них сорвет цветок.
    // Если у одного из цветков четное количество лепестков,
    // а у другого — нечетное, это значит, что они влюблены.
    //
    //Напишите функцию, которая будет брать количество лепестков каждого цветка и возвращать true, если они влюблены, и false, если нет.
    static boolean fallInLove(int firstFlower, int secondFlower) {
        if (firstFlower % 2 == 0 && secondFlower % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    //Задача № 2.3. Нам нужна функция, которая
    // может преобразовать число (целое число) в строку.
    static String numberToString(int num) {
        String str = "" + num;
        return str;
    }

    ///Задача № 2.4. Найти наименьшее целое число в массиве.
    static int maxInArray(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    // Задача № 2.5. Если задано неотрицательное целое число,
    // например 3, вернуть строку с бормотанием: "1 овца...2 овцы...3 овцы...".
    // Ввод всегда будет допустимым, т. е. отрицательных целых чисел не будет.
    static String countingSheep(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = " sheep...";
        for (int i = 1; i <= num; i++) {
            stringBuilder.append(i);
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        System.out.println(countingSheep(3));

    }
}