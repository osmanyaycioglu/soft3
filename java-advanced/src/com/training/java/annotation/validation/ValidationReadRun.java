package com.training.java.annotation.validation;

import java.util.ArrayList;
import java.util.List;

import com.training.java.atm.Account;
import com.training.java.atm.Customer;

public class ValidationReadRun {

    public static void main(final String[] args) {
        List<Account> accountsLoc = new ArrayList<>();
        Customer customerLoc = Customer.getBuilder()
                                       .name("osman")
                                       .surname("yaycıoğlu")
                                       .username("osmany")
                                       .password("123456" + "")
                                       .addAll(accountsLoc)
                                       .build();
        ValidationEngine engineLoc = new ValidationEngine();
        ValidateResult validateLoc = engineLoc.validate(customerLoc);
        System.out.println(validateLoc);

    }
}
