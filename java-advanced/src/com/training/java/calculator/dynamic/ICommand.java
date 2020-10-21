package com.training.java.calculator.dynamic;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public interface ICommand<T, U, R> {

    Supplier<String> menuText();

    BiFunction<T, U, R> operation();

}
