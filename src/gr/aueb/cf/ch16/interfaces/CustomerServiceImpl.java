package gr.aueb.cf.ch16.interfaces;

import gr.aueb.cf.ch16.interfaces.model.Customer;

public class CustomerServiceImpl {
    private ICustomerDAO iCustomerDAO; //an interface as a private instance

    public CustomerServiceImpl(ICustomerDAO iCustomerDAO) { //inject through constructor
        this.iCustomerDAO = iCustomerDAO;
    }

    public void insertCustomer(Customer customer) throws Exception {
        try {
            if (iCustomerDAO.getCustomerByVat(customer.getVat()) != null) { //does this vat exists?
                throw new Exception("");
            }

            iCustomerDAO.addCustomer(customer);
        } catch (Exception e) {
            System.err.println("");
            throw e;
        }
    }
}
