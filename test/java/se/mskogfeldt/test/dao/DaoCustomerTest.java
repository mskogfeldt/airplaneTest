package se.mskogfeldt.test.dao;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import se.mskogfeldt.dao.CustomerDao;
import se.mskogfeldt.entity.CustomerEntity;

import java.util.Collection;

public class DaoCustomerTest {

    @Test
    public void testCreateAndReadFromCustomerDao(){
        ApplicationContext applicationContext = new GenericXmlApplicationContext("dao-impl.xml");
       // AirLineDao airLineDao = new AirLineDaoImpl();
        CustomerDao customerDao = applicationContext.getBean(CustomerDao.class);
        customerDao.create(CustomerEntity.builder().withFirstName("adam")
                .withLastName("andersson")
                .withSsn("123456").build());

        customerDao.create(CustomerEntity.builder().withFirstName("adam")
                .withLastName("andersson")
                .withSsn("1234567").build());

        Assert.assertEquals(1, customerDao.read("123456").size());
        Collection<CustomerEntity> customers=customerDao.read("1234567");
        System.out.println(customers);
    }
/*
    @Test
    public void testDeleteAirLineFromDao(){
        ApplicationContext applicationContext = new GenericXmlApplicationContext("dao-impl.xml");
        customerDao.create(CustomerEntity.builder().withTreasury(50000).withName("Airair").build());
        customerDao.create(CustomerEntity.builder().withTreasury(50000).withName("Airair2").build());
        customerDao.delete("Airair");
        Assert.assertEquals(1, customerDao.readAll().size());
        Collection<CustomerEntity> airLines=airLineDao.readAll();
        System.out.println(airLines);
    }

    @Test
    public void readAllFromAirLineDao(){
        AirLineDao airLineDao = new AirLineDaoImpl();
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair").build());
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair2").build());
        Assert.assertEquals(2, airLineDao.readAll().size());
        Collection<AirLineEntity> airLines=airLineDao.readAll();
        System.out.println(airLines);
    }

 */


}

