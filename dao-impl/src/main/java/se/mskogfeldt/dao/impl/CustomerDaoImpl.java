package se.mskogfeldt.dao.impl;

import se.mskogfeldt.dao.CustomerDao;

import java.util.Objects;

public class CustomerDaoImpl implements CustomerDao {

    private final CustomerDao customerDao;

    public CustomerDaoImpl(CustomerDao customerDao){
        this.customerDao = Objects.requireNonNull(customerDao, "customerDao cannot be null");
    }
}
