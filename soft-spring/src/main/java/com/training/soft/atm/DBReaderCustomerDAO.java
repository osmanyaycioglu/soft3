package com.training.soft.atm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class DBReaderCustomerDAO implements ICustomerDAO {

    @Autowired
    private IDBCustomerDAO custDAO;

    @Override
    public List<Customer> getAllCustomers() {
        try {
            Iterable<Customer> findAllLoc = this.custDAO.findAll();
            List<Customer> custList = new ArrayList<>();
            for (Customer customerLoc : findAllLoc) {
                custList.add(customerLoc);
            }
            return custList;
        } catch (Exception eLoc) {
            eLoc.printStackTrace();;
        }
        return new ArrayList<>();
    }

}
