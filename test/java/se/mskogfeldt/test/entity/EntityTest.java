package se.mskogfeldt.test.entity;

import org.junit.Assert;
import org.junit.Test;
import se.mskogfeldt.domain.BusinessClassSeat;
import se.mskogfeldt.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EntityTest {

    @Test
    public void testCreatingAirLineEntity(){
        List<BusinessClassSeatEntity> businessClassSeatEntities = new ArrayList<>();
        List<EconomyClassSeatEntity> economyClassSeatEntities = new ArrayList<>();

        BusinessClassSeatEntity businessClassSeatEntity1 = BusinessClassSeatEntity.builder()
                .withSeatNumber(1).build();
        EconomyClassSeatEntity economyClassSeatEntity1 = EconomyClassSeatEntity.builder()
                .withSeatNumber(1).build();
        businessClassSeatEntities.add(businessClassSeatEntity1);
        economyClassSeatEntities.add(economyClassSeatEntity1);

        AirplaneEntity airplaneEntity = AirplaneEntity.builder().withId("12345")
                .withBusinessClassSeatEntitys(businessClassSeatEntities)
                .withEconomyClassSeatEntitys(economyClassSeatEntities).build();

        List<AirplaneEntity> fleat1 = new ArrayList<>();
        fleat1.add(airplaneEntity);

        AirLineEntity airLineEntity = AirLineEntity.builder()
                .withName("Airair")
                .withTreasury(50000)
                .withFleat(fleat1).build();

        Assert.assertNotNull(airLineEntity.getTreasury());
    }

    @Test
    public void testCreatingCustomerentity() {
        CustomerEntity customerEntity = CustomerEntity.builder().withFirstName("Adam")
                .withLastName("Andersson").withSsn("12345").build();
        Assert.assertNotNull(customerEntity.getFirstName());
    }

    @Test
    public void testCreatingFoodEntity() {
        FoodEntity foodEntity = FoodEntity.builder().withName("Apple")
                .withCost(100).build();
        Assert.assertNotNull(foodEntity.getName());
    }

    @Test
    public void testCreatingAirplaneEntity(){

        List<BusinessClassSeatEntity> businessClassSeatEntities = new ArrayList<>();
        List<EconomyClassSeatEntity> economyClassSeatEntities = new ArrayList<>();
        BusinessClassSeatEntity businessClassSeatEntity1 = BusinessClassSeatEntity.builder()
                .withSeatNumber(1).build();
        EconomyClassSeatEntity economyClassSeatEntity1 = EconomyClassSeatEntity.builder()
                .withSeatNumber(1).build();
        businessClassSeatEntities.add(businessClassSeatEntity1);
        economyClassSeatEntities.add(economyClassSeatEntity1);

        AirplaneEntity airplaneEntity = AirplaneEntity.builder().withId("12345")
                .withBusinessClassSeatEntitys(businessClassSeatEntities)
                .withEconomyClassSeatEntitys(economyClassSeatEntities).build();
        Assert.assertNotNull(airplaneEntity.getId());
    }

    @Test
    public void testCreatingTripEntity(){

        List<BusinessClassSeatEntity> businessClassSeatEntities = new ArrayList<>();
        List<EconomyClassSeatEntity> economyClassSeatEntities = new ArrayList<>();

        BusinessClassSeatEntity businessClassSeatEntity1 = BusinessClassSeatEntity.builder()
                .withSeatNumber(1).build();

        EconomyClassSeatEntity economyClassSeatEntity1 = EconomyClassSeatEntity.builder()
                .withSeatNumber(1).build();

        businessClassSeatEntities.add(businessClassSeatEntity1);
        economyClassSeatEntities.add(economyClassSeatEntity1);

        List<FoodEntity> bMenuEntity = new ArrayList<>();
        List<FoodEntity> eMenuEntity = new ArrayList<>();

        FoodEntity eal = FoodEntity.builder().withName("Eal")
                .withCost(100).build();

        FoodEntity banana = FoodEntity.builder().withName("Banana")
                .withCost(200).build();

        bMenuEntity.add(banana);
        eMenuEntity.add(eal);

        AirplaneEntity airplaneEntity = AirplaneEntity.builder().withId("12345")
                .withBusinessClassSeatEntitys(businessClassSeatEntities)
                .withEconomyClassSeatEntitys(economyClassSeatEntities).build();

        List<AirplaneEntity> fleat1 = new ArrayList<>();
        fleat1.add(airplaneEntity);

        AirLineEntity airLineEntity = AirLineEntity.builder()
                .withName("Airair")
                .withTreasury(50000)
                .withFleat(fleat1).build();

        TripEntity tripEntity = TripEntity.builder()
                .withAirLineEntity(airLineEntity)
                .withAirplaneEntity(airplaneEntity)
                .withBusinessClassMenuEntity(bMenuEntity)
                .withEconomyClassMenuEntity(eMenuEntity)
                .withAvaibleBusinessClassSeatEntitys(airplaneEntity.getBusinessClassSeatEntitys())
                .withBookedBusinessClassSeatEntitys(new HashMap<String, BusinessClassSeatEntity>())
                .withAvalibleEconomiClassSeatEntitys(airplaneEntity.getEconomyClassSeatEntitys())
                .withBookedEconomiClassSeatEntitys(new HashMap<String, EconomyClassSeatEntity>())
                .withCostForBuisnessClassSeat(20000)
                .withCostForEconomyClassSeat(5000)
                .build();

        Assert.assertNotNull(tripEntity.getCostForEconomyClassSeat());

    }

}
