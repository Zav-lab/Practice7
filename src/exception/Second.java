package exception;

public class Second {

    public static void main(String[] args) {
        try {
            divideDoubleNumbers(10.0, 2.0);
            createPositiveNumber(5);
            checkStringLength("ValidString");
        } catch (Exception e) {
            System.err.println("Исключение" + e.getMessage());
        }

        try {
            divideDoubleNumbers(6.0, 0.0);
        } catch (ArithmeticException e) {
            System.err.println("Ошибка деления на ноль: " + e.getMessage());
        }

        try {
            createPositiveNumber(-10);
        } catch (IllegalArgumentException e) {
            System.err.println("Недопустимое значение для создания объекта:" + e.getMessage());
        }

        try {
            checkStringLength(null);
        } catch (NullPointerException e) {
            System.err.println("Невозможно проверить длину null строки: " + e.getMessage());
        }
    }
    public static double divideDoubleNumbers(double numerator, double denominator) {
        if (denominator == 0.0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return numerator / denominator;
    }
    public static void createPositiveNumber(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Значение должно быть положительным");
        }
        System.out.println("Объект создан с положительным значением: " + value);
    }
    public static void checkStringLength(String str) {
        if (str == null) {
            throw new NullPointerException("Получена null строка"); // Error: null строка
        }
        if (str.length() > 10) {
            throw new IllegalArgumentException("Длина строки превышает 10 символов"); // Error: превышение длины
        }
        System.out.println("Длина строки в пределах допустимого значения: " + str.length());
    }
}