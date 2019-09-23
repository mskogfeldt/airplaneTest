package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.CustomerDao;
import se.mskogfeldt.domain.Customer;
import se.mskogfeldt.entity.CustomerEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomerDaoImpl implements CustomerDao {

   // private final CustomerDao customerDao;
    private Map<String, CustomerEntity> customers = new HashMap<>();

   /* public CustomerDaoImpl(CustomerDao customerDao){
        this.customerDao = Objects.requireNonNull(customerDao, "customerDao cannot be null");
    }
*/
    public Map<String, CustomerEntity> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<String, CustomerEntity> customers) {
        this.customers = customers;
    }


    public void create(CustomerEntity customerEntity) {
        if(customers.containsKey(customerEntity.getSsn())){
            throw new RuntimeException("Customer already exists");
        }
        customers.put(customerEntity.getSsn(),customerEntity);
    }

    public Collection<CustomerEntity> read(String name) {
        return customers.values().stream().filter(customerEntity -> customerEntity.getSsn().equalsIgnoreCase(name)).collect(Collectors.toSet());

    }
}
