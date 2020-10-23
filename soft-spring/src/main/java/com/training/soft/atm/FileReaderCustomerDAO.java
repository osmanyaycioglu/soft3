package com.training.soft.atm;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileReaderCustomerDAO implements ICustomerDAO {

    @Override
    public List<Customer> getAllCustomers() {
        try {
            Path path = Paths.get("customer.txt");
            List<String> readAllLinesLoc = Files.readAllLines(path);
            return readAllLinesLoc.stream()
                                  .map(l -> l.split(","))
                                  .filter(sa -> sa.length == 6)
                                  .map(sa -> Customer.getBuilder()
                                                     .name(sa[0])
                                                     .surname(sa[1])
                                                     .username(sa[2])
                                                     .password(sa[3])
                                                     .addAll(Account.parse(sa[5]))
                                                     .active(Boolean.parseBoolean(sa[4]))
                                                     .build())
                                  .filter(c -> c.isActive())
                                  .collect(Collectors.toList());
        } catch (Exception eLoc) {
            eLoc.printStackTrace();;
        }
        return new ArrayList<>();
    }

}
