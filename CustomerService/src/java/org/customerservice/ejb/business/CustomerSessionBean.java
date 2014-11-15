/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customerservice.ejb.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ayanda
 */
@Stateless
public class CustomerSessionBean {
    @PersistenceContext(unitName = "CustomerServicePU")
    private EntityManager em;

    public Long createClientAccount(long IdNumber, String contactNumber, String firstName, String lastName, String emailAddress) {
        Customer customer = new Customer();
        persist(customer);
        em.refresh(customer);
        return new Long(customer.getCustomerUuid());
    }

    public void persist(Customer customer) {
        em.persist(customer);
    }
}
