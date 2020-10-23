package com.training.soft.atm;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private long                customerId;
    private String              name;
    private String              surname;
    private String              username;
    private String              password;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "customer")
    private final List<Account> accountList = new ArrayList<>();
    private boolean             active;

    private Customer() {
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public List<Account> getAccountList() {
        return this.accountList;
    }

    public boolean isActive() {
        return this.active;
    }

    public static CustomerBuilder getBuilder() {
        return new CustomerBuilder();
    }

    public static class CustomerBuilder {

        private final Customer customer = new Customer();

        private CustomerBuilder() {
        }

        public CustomerBuilder name(final String nameParam) {
            this.customer.name = nameParam;
            return this;
        }


        public CustomerBuilder surname(final String surnameParam) {
            this.customer.surname = surnameParam;
            return this;
        }


        public CustomerBuilder username(final String usernameParam) {
            this.customer.username = usernameParam;
            return this;
        }


        public CustomerBuilder password(final String passwordParam) {
            this.customer.password = passwordParam;
            return this;
        }


        public CustomerBuilder active(final boolean activeParam) {
            this.customer.active = activeParam;
            return this;
        }

        public CustomerBuilder addAll(final List<Account> accounts) {
            this.customer.accountList.addAll(accounts);
            return this;
        }

        public Customer build() {
            return this.customer;
        }

    }

    @Override
    public String toString() {
        return "Customer [name="
               + this.name
               + ", surname="
               + this.surname
               + ", username="
               + this.username
               + ", password="
               + this.password
               + ", accountList="
               + this.accountList
               + ", active="
               + this.active
               + "]";
    }

    public long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final long customerIdParam) {
        this.customerId = customerIdParam;
    }


}
