package com.training.soft.atm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerRest {

    @Autowired
    private IDBCustomerDAO  custDao;

    @Autowired
    private CustomerManager cm;

    @PostMapping("/insert")
    public String insert(@RequestBody final Customer cust) {
        List<Account> accountListLoc = cust.getAccountList();
        for (Account accountLoc : accountListLoc) {
            accountLoc.setCustomer(cust);
        }
        this.custDao.save(cust);
        this.cm.init();
        return "OK";
    }

}
