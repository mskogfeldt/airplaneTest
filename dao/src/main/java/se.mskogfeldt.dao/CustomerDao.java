package se.mskogfeldt.dao;

import se.mskogfeldt.entity.CustomerEntity;

import java.util.Collection;

public interface CustomerDao {

    void create(CustomerEntity customerEntity);

    Collection<CustomerEntity> read(final String id);

    void delete(String id);

}
