package com.training.soft.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeDAO extends CrudRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<Employee> findByNameAndSurname(String name,
                                        String surname);


    @Query("select e from Employee e where e.name=:isim")
    List<Employee> searchName(@Param("isim") String name);

    @Query(value = "select * from calisan where ad=:isim", nativeQuery = true)
    List<Employee> searchNameNative(@Param("isim") String name);

}
