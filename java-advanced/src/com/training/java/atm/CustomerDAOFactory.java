package com.training.java.atm;


public class CustomerDAOFactory {

    public static ICustomerDAO createCustomerDAO() {
        // return new StaticCustomerDAO();
        return new FileReaderCustomerDAO();
    }

}
