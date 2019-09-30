package se.mskogfeldt.test.dao;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import se.mskogfeldt.dao.AirLineDao;
import se.mskogfeldt.dao.impl.AirLineDaoImpl;
import se.mskogfeldt.domain.AirLine;
import se.mskogfeldt.entity.AirLineEntity;

import java.util.Collection;

public class DaoAirLineTest {


    @Test
    public void testCreateAndReadFromAirlineDao(){
        ApplicationContext applicationContext = new GenericXmlApplicationContext("dao-impl.xml");
       // AirLineDao airLineDao = new AirLineDaoImpl();
        AirLineDao airLineDao = applicationContext.getBean(AirLineDao.class);
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair").build());
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair2").build());

        Assert.assertEquals(1, airLineDao.read("Airair").size());
        Collection<AirLineEntity> airLines=airLineDao.read("Airair");
        System.out.println(airLines);
    }

    @Test
    public void testDeleteAirLineFromDao(){
        AirLineDao airLineDao = new AirLineDaoImpl();
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair").build());
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair2").build());
        airLineDao.delete("Airair");
        Assert.assertEquals(1, airLineDao.readAll().size());
        Collection<AirLineEntity> airLines=airLineDao.readAll();
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




}
