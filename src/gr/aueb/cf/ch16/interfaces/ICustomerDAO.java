package gr.aueb.cf.ch16.interfaces;

import gr.aueb.cf.ch16.interfaces.model.Customer;

public interface ICustomerDAO {
    void addCustomer (Customer customer); //pass the customer instead of all the fields of customer
    void updateCustomer (Long id, Customer customer);
    boolean removeCustomer(Long id);
    Customer getCustomerById(Long id); //get a customer (eg. select * where id = id)
    Customer getCustomerByPhoneNumber(String phoneNumber);
    Customer [] getCustomersByRegion(String region); //in case of many customers.
    Customer getCustomerByVat(String vat);

}
