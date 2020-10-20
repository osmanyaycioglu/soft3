package com.training.java.atm;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderCustomerDAO implements ICustomerDAO {

    @Override
    public List<Customer> getAllCustomers() {
        try {
            Path path = Paths.get("customer.txt");
            List<String> readAllLinesLoc = Files.readAllLines(path);
            List<Customer> custList = new ArrayList<>();
            for (String stringLoc : readAllLinesLoc) {
                String[] sa = stringLoc.split(",");
                boolean active = Boolean.parseBoolean(sa[4]);
                if (active) {
                    custList.add(Customer.getBuilder()
                                         .name(sa[0])
                                         .surname(sa[1])
                                         .username(sa[2])
                                         .password(sa[3])
                                         .addAll(Account.parse(sa[5]))
                                         .active(active)
                                         .build());
                }
            }
            return custList;

        } catch (Exception eLoc) {
            eLoc.printStackTrace();;
        }
        return new ArrayList<>();
    }

}
