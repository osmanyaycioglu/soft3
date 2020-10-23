package com.training.soft.atm;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ATMRun {

    @Autowired
    private CustomerManager customerManager;

    public void run() {

        try (Scanner scannerLoc = new Scanner(System.in)) {
            System.out.println("Username : ");
            String username = scannerLoc.nextLine();
            System.out.println("Password : ");
            String password = scannerLoc.nextLine();
            Customer customerLoc = this.customerManager.login(username,
                                                              password);
            if (customerLoc != null) {
                System.out.println("Merhaba " + customerLoc.getName() + " " + customerLoc.getSurname());
                System.out.println("Hesaplarınız");
                List<Account> accountListLoc = customerLoc.getAccountList();
                for (Account accountLoc : accountListLoc) {
                    System.out.println(accountLoc);
                }
            } else {
                System.out.println("Böyle bir user yok");
            }

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

}
