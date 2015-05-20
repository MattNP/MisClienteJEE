/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entities.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author mateo.norena
 */
@Stateless
@LocalBean
public class CustomerManager {

    @PersistenceContext(unitName = "MisClientesJEE-ejbPU")
    private EntityManager em;
    
    public List<Customer> getAllCustomers() {
        Query query = em.createNamedQuery("Customer.findAll");
        return query.getResultList();
    }
    
    public Customer update(Customer customer) {
        return em.merge(customer);
    }
    
    public void persist(Object object) {
        em.persist(object);
    }
    
}
