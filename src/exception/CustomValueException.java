package exception;

class CustomValueException extends Exception {
    public CustomValueException(String message) {
        super(message);
    }
}

class ExceptionTryTest {
    public static void main(String[] args) {
        try {
            performOperation(1);
        } catch (CustomValueException e) {
            System.err.println("Произошло исключение: " + e.getMessage());
        }

        try {
            performOperation(-1);
        } catch (CustomValueException e) {
            System.err.println("Произошло исключение: " + e.getMessage());
        }
    }

    public static void performOperation(int value) throws CustomValueException {
        if (value > 0) throw new CustomValueException("Число " + value + " больше "+ 0);
        else if (value < 10) throw new CustomValueException("Число " + value + " меньше "+ 10);
        System.out.println("Готово");
    }
}
