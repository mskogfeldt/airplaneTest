package se.mskogfeldt.test.entity;

import org.junit.Assert;
import org.junit.Test;
import se.mskogfeldt.domain.BusinessClassSeat;
import se.mskogfeldt.entity.*;

import java.util.ArrayList;
import java.util.List;

public class EntityTest {

    @Test
    public void testCreatingAirLineEntity(){
        List<BusinessClassSeatEntity> businessClassSeatEntities = new ArrayList<>();
        List<EconomyClassSeatEntity> economyClassSeatEntities = new ArrayList<>();
        List<AirplaneEntity> fleat = new ArrayList<>();
        BusinessClassSeatEntity businessClassSeatEntity1 = BusinessClassSeatEntity.builder()
                .withSeatnumber(1).build();
        EconomyClassSeatEntity economyClassSeatEntity1 = EconomyClassSeatEntity.builder()
                .withSeatnumber(1).build();
        businessClassSeatEntities.add(businessClassSeatEntity1);
        economyClassSeatEntities.add(economyClassSeatEntity1);

        AirplaneEntity airplaneEntity = AirplaneEntity.builder().withId("12345")
                .withBusinessClassSeatEntitys(businessClassSeatEntities)
                .withEconomyClassSeatEntitys(economyClassSeatEntities).build();


        AirLineEntity airLineEntity = AirLineEntity.builder()
                .withName("Airair")
                .withTreasury(50000).build();
        airLineEntity.fleat.add(airplaneEntity);
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
                .withSeatnumber(1).build();
        EconomyClassSeatEntity economyClassSeatEntity1 = EconomyClassSeatEntity.builder()
                .withSeatnumber(1).build();
        businessClassSeatEntities.add(businessClassSeatEntity1);
        economyClassSeatEntities.add(economyClassSeatEntity1);

        AirplaneEntity airplaneEntity = AirplaneEntity.builder().withId("12345")
                .withBusinessClassSeatEntitys(businessClassSeatEntities)
                .withEconomyClassSeatEntitys(economyClassSeatEntities).build();
        Assert.assertNotNull(airplaneEntity.getId());
    }

    @Test
    public void testCreatingTrip(){
        List<BusinessClassSeatEntity> businessClassSeatEntities = new ArrayList<>();
        List<EconomyClassSeatEntity> economyClassSeatEntities = new ArrayList<>();
        BusinessClassSeatEntity businessClassSeatEntity1 = BusinessClassSeatEntity.builder()
                .withSeatnumber(1).build();
        EconomyClassSeatEntity economyClassSeatEntity1 = EconomyClassSeatEntity.builder()
                .withSeatnumber(1).build();
        businessClassSeatEntities.add(businessClassSeatEntity1);
        economyClassSeatEntities.add(economyClassSeatEntity1);

        AirplaneEntity airplaneEntity = AirplaneEntity.builder().withId("12345")
                .withBusinessClassSeatEntitys(businessClassSeatEntities)
                .withEconomyClassSeatEntitys(economyClassSeatEntities).build();

        TripEntity tripEntity = TripEntity.builder()
                .withAvaibleBusinessClassSeatEntitys(airplaneEntity.getBusinessClassSeatEntitys())
                .withBookedBusinessClassSeatEntitys(new ArrayList<BusinessClassSeatEntity>())
                .withAvalibleEconomiClassSeatEntitys(airplaneEntity.getEconomyClassSeatEntitys())
                .withBookedEconomiClassSeatEntitys(new ArrayList<EconomyClassSeatEntity>())
                .withCostForBuisnessClassSeat(20000)
                .withCostForEkonomyClassSeat(5000)
                .build();

        Assert.assertNotNull(tripEntity.getCostForEkonomyClassSeat());

    }

}
