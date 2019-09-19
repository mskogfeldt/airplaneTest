package se.mskogfeldt.service;

import se.mskogfeldt.domain.Customer;

public interface CustomerService {


    String DEFAULT_BEAN_NAME = "customerService";


   void createCustomer(Customer customer);

    /*
    String DEFAULT_BEAN_NAME = "accountComponentService";

    //account.hashCode() % numberOfPartitions
    void createAccount(@Routing("getSsn") Account account);
     */
}
