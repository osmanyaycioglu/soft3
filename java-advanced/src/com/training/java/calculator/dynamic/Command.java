package com.training.java.calculator.dynamic;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Command<T, U, R> implements ICommand<T, U, R> {

    private final Supplier<String>    strSupplier;
    private final BiFunction<T, U, R> opBiFunction;

    public Command(final Supplier<String> strSupplierParam,
                     final BiFunction<T, U, R> opBiFunctionParam) {
        super();
        this.strSupplier = strSupplierParam;
        this.opBiFunction = opBiFunctionParam;
    }

    @Override
    public Supplier<String> menuText() {
        return this.strSupplier;
    }

    @Override
    public BiFunction<T, U, R> operation() {
        return this.opBiFunction;
    }


}
