package ru.exceptions;

public class Main {
    public static void main(String[] args) {

        System.out.println(args[9]);


    }

    private static void workWithExceptionTypes() {
        try {
            String magicRow = calculateMagicRowWithException(60.8, 44);
            System.out.println(magicRow);
            System.out.println(magicRow.length());
        } catch (SomeAnotherValueGreatedThanValueAtStartException e) {
            System.out.println("Второе значение должно быть меньше первого");
        }
        catch (SomeAnotherValueNultipleOf3 e) {
            System.out.println("Второе значение не должно быть крастно трем");
        }
        catch (IncorrectMagicRowException e) {  // Исключение, которое отрабатывает, если все наши прописанные исключения не являются причиной оставновки программы
            System.out.println("Простите, невозможно создать строку");
        }
        catch (Exception ex) {
            System.out.println("Произошла ужасна ошибка");
        }
    }

    // мы обрабатываем свои собственные исключения, отправляя их в IncorrectMagicRowException,чтобы не смешивать их с уже существующими исключениями Exception
    public static String calculateMagicRowWithException(double valueAtStart, int someAnotherValue) throws IncorrectMagicRowException{
        if (someAnotherValue >= valueAtStart) {
            throw new SomeAnotherValueGreatedThanValueAtStartException(); // Выбрасываем свои исключения(эти классы наследники)
        }
        if (someAnotherValue % 3 == 0) {
            throw new SomeAnotherValueNultipleOf3();
        }
        return "Hello! " + valueAtStart + " I am magic row!! " + someAnotherValue + " @@@";
    }

    private static void workWithResult() {
        String magicRow = calculateMagicRow(6.8, 4);
        System.out.println(magicRow);
        System.out.println(magicRow.length());

        MagicRowResult magicRow2 = calculateMagicRowWithResult(6.8, 42);
        if (magicRow2.isError()) {
            System.out.println("Magic row can't be created! " + magicRow2.getErrorMessage());
        } else {
            System.out.println(magicRow2.getMagicRow());
        }
    }

    public static MagicRowResult calculateMagicRowWithResult(double valueAtStart, int someAnotherValue) {
        if (someAnotherValue >= valueAtStart) {
            return MagicRowResult.error("someAnotherValue must be lower than valueAtStart");
        }
        if (someAnotherValue % 3 == 0) {
            return MagicRowResult.error("someAnotherValue % 3 can't be equal 0");
        }
        return MagicRowResult.correct("Hello! " + valueAtStart + " I am magic row!! " + someAnotherValue + " @@@");
    }



   public static String calculateMagicRow(double valueAtStart, int someAnotherValue) {
        if (someAnotherValue >= valueAtStart) {
            return null;
        }
        return "Hello! " + valueAtStart + " I am magic row!! " + someAnotherValue + " @@@";
   }
}


