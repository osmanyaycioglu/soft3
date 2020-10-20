package com.training.java.atm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private String     name;
    private BigDecimal amount;

    public Account() {

    }

    public Account(final String nameParam,
                   final BigDecimal amountParam) {
        super();
        this.name = nameParam;
        this.amount = amountParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(final BigDecimal amountParam) {
        this.amount = amountParam;
    }

    @Override
    public String toString() {
        return "Account [name=" + this.name + ", amount=" + this.amount + "]";
    }


    public static List<Account> parse(final String accountStr) {
        String[] aaccountStrLoc = accountStr.split(";");
        List<Account> accountsLoc = new ArrayList<>();
        for (String accountLoc : aaccountStrLoc) {
            String[] sa = accountLoc.split("#");
            accountsLoc.add(new Account(sa[0],
                                        new BigDecimal(sa[1])));

        }
        return accountsLoc;
    }

    public static void main(final String[] args) {
        String[] splitLoc = "TL#100".split("#");
        System.out.println(splitLoc);
    }
}
