package exception;

public class First {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.err.println("Error 0. Деление на ноль" + e.getMessage());
        }

        try {
            accessToUnexistingElement();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error 1. Элемент массива отсутсвует" + e.getMessage());
        }

        try {
            playWithNullPointer();
        } catch (NullPointerException e) {
            System.err.println("Error 2. Ошибка указателя" + e.getMessage());
        }

        try {
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException e) {
            System.err.println("Error 3. Массив отрицательного размера" + e.getMessage());
        }

        try {
            searchSomethingOutString();
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Error 4. Выход за пределы строки: " + e.getMessage());
        }

        System.out.println("Error 5.Ура! Меня снова печают");
    }

    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length + 1; i++) {
            System.out.printf("%d,", i);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        System.out.println("important is " + importantData);
    }

    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }
}
