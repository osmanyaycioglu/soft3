package com.training.soft.atm;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private long       accountId;
    private String     name;
    private BigDecimal amount;
    @JsonIgnore
    @XmlTransient
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Customer   customer;

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
        return Arrays.stream(accountStr.split(";"))
                     .map(s -> s.split("#"))
                     .filter(sa -> sa.length == 2)
                     .map(sa -> new Account(sa[0],
                                            new BigDecimal(sa[1])))
                     .collect(Collectors.toList());
    }

    public static void main(final String[] args) {
        String[] splitLoc = "TL#100".split("#");
        System.out.println(splitLoc);
    }

    public long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(final long accountIdParam) {
        this.accountId = accountIdParam;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(final Customer customerParam) {
        this.customer = customerParam;
    }
}
