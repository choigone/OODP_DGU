package com.top;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChainLambda {
    public static void main(String[] args) {
        UnaryOperator<String> concreteHandler1 =
                (String text) -> "do somthing : " + text;
        UnaryOperator<String> concreteHandler2 =
                (String text) -> "do somthing : " + text;

        Function<String, String> Handler = concreteHandler1.andThen(concreteHandler2);
        String result = concreteHandler1.apply("processing");
    }
}
