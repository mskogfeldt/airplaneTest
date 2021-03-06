package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.CustomerDao;
import se.mskogfeldt.domain.Customer;
import se.mskogfeldt.entity.CustomerEntity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CustomerDaoImpl implements CustomerDao {

   // private final CustomerDao customerDao;
    private Map<String, CustomerEntity> customers = new HashMap<>();


  //  public Map<String, CustomerEntity> getCustomers() {
  //      return customers;}

    //public void setCustomers(Map<String, CustomerEntity> customers) {
  //      this.customers = customers;
   // }


    public void create(CustomerEntity customerEntity) {
        if(customers.containsKey(customerEntity.getSsn())){
            throw new RuntimeException("Customer already exists");
        }
        customers.put(customerEntity.getSsn(),customerEntity);
    }

    public Collection<CustomerEntity> read(String ssn) {
        return customers.values().stream().filter(customerEntity -> customerEntity.getSsn().equalsIgnoreCase(ssn)).collect(Collectors.toSet());

    }

    public void delete(String id){
        if (!customers.containsKey(id)){
            throw  new RuntimeException("Cannot find Airplane with this ID");
        }
        customers.remove(id);
    }


}
