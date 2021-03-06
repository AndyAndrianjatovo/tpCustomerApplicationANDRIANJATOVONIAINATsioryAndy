/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.andya.tpcustomerapplication.managedbeans;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import mg.andya.tpcustomerapplication.entities.Customer;
import mg.andya.tpcustomerapplication.session.CustomerManager;

/**
 *
 * @author andya
 */
@Named(value = "customerMBean")
@ViewScoped
public class CustomerMBean implements Serializable {
    private List<Customer> customerList;
    @EJB
    private CustomerManager customerManager;

    
    /**
     * Creates a new instance of CustomerMBean
     */
    public CustomerMBean() {
    }
    
    
    public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
}
