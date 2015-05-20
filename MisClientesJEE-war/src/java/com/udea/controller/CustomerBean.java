/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.entities.Customer;
import com.udea.session.CustomerManager;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author mateo.norena
 */
public class CustomerBean implements Serializable {
    @EJB
    private CustomerManager customerManager;

    //Propiedades
    //Para mostrar/actualizar/insertar en el form
    private Customer customer;
    //Para Mostrar en la Tabla
    private List<Customer> customers;
    
    //Retorna la lista de clientes para
    //desplegar en la Tabla
    public List<Customer> getCustomer() {
        if(customers==null && customers.isEmpty())
            refresh(); //refresca la Lista
        return customers;
    }
    
    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
    }

    private void refresh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
