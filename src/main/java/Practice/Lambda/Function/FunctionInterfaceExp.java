package Practice.Lambda.Function;

import java.util.Scanner;
import java.util.function.*;

public class FunctionInterfaceExp {
    public static void main(String[] args) {
        Predicate<Integer> isZero = value -> value == 0; //проверка условия с помощью метода функц. интерфейса
        System.out.println(isZero.test(0));
        System.out.println(isZero.test(7));
        System.out.println("///////////////////");

        Consumer<String> printer = string -> System.out.println(string); //выполняет какое-либо действие над T ничего не возвращая
        printer.accept("Hello world");
        System.out.println("///////////////////");

        Function<Integer, Double> conventer = Integer::doubleValue; //выполняет переход объекта типо Т в тип R
        System.out.println(conventer.apply(2));
        System.out.println("///////////////////");

//        Supplier<String> text = () -> { //не принимает никаких аргументов, но возращает тип Т
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Put some text: ");
//            return scanner.nextLine();
//        };
//        System.out.println(text.get());
        System.out.println("///////////////////");

        UnaryOperator<Double> sqrt = value -> Math.sqrt(value); //позволяет выполнять унарные операции над объектом типа Т
        System.out.println(sqrt.apply(9.0));
        System.out.println("///////////////////");

        BinaryOperator<Double> pow = (value1,value2) -> Math.pow(value1,value2); ////позволяет выполнять бинарные операции над объектом типа Т и U
        System.out.println(pow.apply(2.0,5.0));
        System.out.println("///////////////////");


    }
}
