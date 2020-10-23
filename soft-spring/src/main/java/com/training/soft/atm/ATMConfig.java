package com.training.soft.atm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMConfig {

    @Value("${customer.dao.type}")
    private ECustomerDAOType customerDAOType;

    @Bean
    public ICustomerDAO createCustomerDAO() {
        switch (this.customerDAOType) {
            case FILE:
                return new FileReaderCustomerDAO();
            case DB:
                return new DBReaderCustomerDAO();
            default:
                return new FileReaderCustomerDAO();
        }
    }
}
