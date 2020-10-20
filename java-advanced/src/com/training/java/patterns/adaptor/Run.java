package com.training.java.patterns.adaptor;


public class Run {

    public static void main(final String[] args) {
        Employee employeeLoc = new Employee();
        employeeLoc.setSurname("yaycioglu");

        PrintSystem ps = new PrintSystemProxy();
        ps.print(employeeLoc);

        Calisan calisanLoc = new Calisan();
        calisanLoc.setIsim("ali");
        calisanLoc.setSoyisim("veli");

        // Write code
        CalisanEmployeeAdaptor adaptorLoc = new CalisanEmployeeAdaptor(calisanLoc);
        ps.print(adaptorLoc);
    }
}
