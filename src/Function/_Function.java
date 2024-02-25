package Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        System.out.println("Increment by 1");
        int increment = increment(2);
        System.out.println(increment);
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);
        int incrementAndMultiply = incrementByOneFunction.apply(increment2);
        System.out.println("Increment and Multiply");
        System.out.println(incrementAndMultiply);
        System.out.println("Imperative approach");
        System.out.println(incrementByOneAndMultipleBy10(1,10));

        System.out.println("Declarative approach");
        //Declarative : Take 1 argument and produce 1 result
        Function<Integer, Integer> incrementByOneAndMultipleByTwo = incrementByOneFunction.andThen(multiplyByTen);
        System.out.println(incrementByOneAndMultipleByTwo.apply(1));

        //BiFunction : Take 2 argument and produce 1 result
        BiFunction<Integer, Integer, Integer> incrementBy1AndMultipleBy10 =
                (incrementBy1, multiplyBy10) -> (incrementBy1 + 1) * multiplyBy10;

        System.out.println(incrementBy1AndMultipleBy10.apply(4,100));

    }


    //Imperative approach
   static Function<Integer,Integer> incrementByOneFunction =
            number -> number + 1;

   static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    //
    static int increment(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultipleBy10(int incrementByOne, int multipleByTen) {
        return (incrementByOne + 1) * multipleByTen;
    }
}
