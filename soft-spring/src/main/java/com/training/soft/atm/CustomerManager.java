package com.training.soft.atm;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CustomerManager {

    private Map<String/*username*/, Customer> customerMap;

    @Autowired
    private ICustomerDAO                      customerDao;

    @PostConstruct
    @Scheduled(fixedDelay = 60_000, initialDelay = 60_000)
    public void init() {
        Map<String/*username*/, Customer> cMap = new ConcurrentHashMap<>();
        List<Customer> allCustomersLoc = this.customerDao.getAllCustomers();
        for (Customer customerLoc : allCustomersLoc) {
            cMap.put(customerLoc.getUsername(),
                     customerLoc);
        }
        this.customerMap = cMap;
    }

    public Customer login(final String username,
                          final String password) {
        Customer customerLoc = this.customerMap.get(username);
        if (customerLoc == null) {
            return null;
        }
        if (customerLoc.getPassword()
                       .equals(password)) {
            return customerLoc;
        }
        return null;
    }

}
