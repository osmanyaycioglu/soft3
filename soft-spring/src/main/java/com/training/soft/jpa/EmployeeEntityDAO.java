package com.training.soft.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeEntityDAO {

    @PersistenceUnit
    private EntityManagerFactory emf;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert(final Employee emp) {
        EntityManager em = this.emf.createEntityManager();
        em.joinTransaction();
        em.persist(em);
        em.close();
    }

}
