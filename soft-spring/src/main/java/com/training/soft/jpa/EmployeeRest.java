package com.training.soft.jpa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRest {

    @Autowired
    private EmployeeDAO empDao;

    @Autowired
    private DataSource  ds;

    @PostMapping("/insert")
    public String insert(@RequestBody final Employee emp) {
        Address addressLoc = emp.getAddress();
        addressLoc.setEmployee(emp);
        List<Phone> phonesLoc = emp.getPhones();
        for (Phone phoneLoc : phonesLoc) {
            phoneLoc.setEmployee(emp);
        }
        this.empDao.save(emp);
        return "OK";
    }

    @GetMapping("/get/name/{isim}")
    public List<Employee> getByName(@PathVariable("isim") final String name) {
        return this.empDao.findByName(name);
    }

    @GetMapping("/get2/name/{isim}")
    public List<Employee> getByName2(@PathVariable("isim") final String name) throws Exception {
        Connection connectionLoc = this.ds.getConnection();
        PreparedStatement statementLoc = connectionLoc.prepareStatement("select * from calisan where ad=?");
        statementLoc.setString(1,
                               name);
        ResultSet rs = statementLoc.executeQuery();
        List<Employee> empList = new ArrayList<>();
        while (rs.next()) {
            Employee emp = new Employee();
            emp.setAge(rs.getInt("age"));
            emp.setName(rs.getString("ad"));
            emp.setSurname(rs.getString("surname"));
            empList.add(emp);
        }
        return empList;

    }


}
