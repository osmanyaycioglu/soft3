package com.training.java.atm;

import java.util.ArrayList;
import java.util.List;

import com.training.java.annotation.validation.ListSize;
import com.training.java.annotation.validation.Size;


public class Customer {

    @Size(min = 5, max = 15)
    private String              name;
    @Size(min = 5, max = 15)
    private String              surname;
    @Size(min = 8, max = 15)
    private String              username;
    @Size(min = 8, max = 15)
    private String              password;
    @ListSize(min = 1, max = 10)
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


}
