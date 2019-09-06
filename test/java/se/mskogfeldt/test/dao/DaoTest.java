package se.mskogfeldt.test.dao;

import org.junit.Assert;
import org.junit.Test;
import se.mskogfeldt.dao.AirLineDao;
import se.mskogfeldt.dao.impl.AirLineDaoImpl;
import se.mskogfeldt.domain.AirLine;
import se.mskogfeldt.entity.AirLineEntity;

import java.util.Collection;

public class DaoTest {


    @Test
    public void TestCreateAirlineDao(){
        AirLineDao airLineDao = new AirLineDaoImpl();
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair").build());
        airLineDao.create(AirLineEntity.builder().withTreasury(50000).withName("Airair2").build());

        Assert.assertEquals(1, airLineDao.read("Airair").size());
        Collection<AirLineEntity> airLines=airLineDao.read("Airair");
        System.out.println(airLines);
    }


}
