package se.mskogfeldt.test.domain;

import org.junit.Assert;
import org.junit.Test;
import se.mskogfeldt.domain.*;

import java.util.*;

public class DomainTest {

    @Test
    public void testCreatingAirline(){
        List<BusinessClassSeat> businessClassSeats = new ArrayList<>();
        List<EconomyClassSeat>  economyClassSeats = new ArrayList<>();

        BusinessClassSeat businessClassSeat1 = BusinessClassSeat.builder()
                .withSeatNumber(1).build();
        EconomyClassSeat economyClassSeat1 = EconomyClassSeat.builder()
                .withSeatNumber(1).build();
        businessClassSeats.add(businessClassSeat1);
        economyClassSeats.add(economyClassSeat1);

        Airplane airplane =Airplane.builder().withId("12345")
                .withBusinissClassSeats(businessClassSeats)
                .withEconomyClassSeats(economyClassSeats).build();

        List<Airplane> fleat1 = new ArrayList<>();
        fleat1.add(airplane);

        AirLine airLine = AirLine.builder().withName("Airair")
                .withTreasury(50000)
                .withFleat(fleat1).build();
        Assert.assertNotNull(airLine.getName());
    }

    @Test
    public void testCreatingCustomer() {
        Customer customer = Customer.builder().withFirstName("Adam").withLastName("Andersson")
                .withSsn("12345").build();
        Assert.assertNotNull(customer.getFirstName());
    }

     @Test
     public void testCreatingFood(){
         Food food = Food.builder().withName("Apple").withCost(100).build();
         Assert.assertNotNull(food.getName());
     }

    @Test
    public void testCreatingAirplane() {

        List<BusinessClassSeat> businessClassSeats =new ArrayList<>();
        List<EconomyClassSeat>  economyClassSeats = new ArrayList<>();

        BusinessClassSeat businessClassSeat1 = BusinessClassSeat.builder()
                .withSeatNumber(1).build();
        EconomyClassSeat economyClassSeat1 = EconomyClassSeat.builder()
                .withSeatNumber(1).build();
        businessClassSeats.add(businessClassSeat1);
        economyClassSeats.add(economyClassSeat1);

        Airplane airplane =Airplane.builder().withId("12345")
                .withBusinissClassSeats(businessClassSeats)
                .withEconomyClassSeats(economyClassSeats).build();

        Assert.assertNotNull(airplane.getId());
    }



    @Test
    public void testCreatingBuisinessClassSeat(){
        BusinessClassSeat buisinessClassSeat1 = BusinessClassSeat.builder()
                .withSeatNumber(1).build();
        Assert.assertNotNull(buisinessClassSeat1.getSeatNumber());
    }

    @Test
    public void testCreatingEconomyClassSeat(){
        EconomyClassSeat economyClassSeat1 = EconomyClassSeat.builder()
                .withSeatNumber(1).build();
        Assert.assertNotNull(economyClassSeat1.getSeatNumber());
    }

    @Test
    public void testCreatingTrip() {

        Customer customer1 = Customer.builder().withFirstName("Adam").withLastName("Andersson")
                .withSsn("12345").build();

        List<BusinessClassSeat> businessClassSeats =new ArrayList<>();
        List<EconomyClassSeat>  economyClassSeats = new ArrayList<>();

        BusinessClassSeat businessClassSeat1 = BusinessClassSeat.builder()
                .withSeatNumber(1).build();
        EconomyClassSeat economyClassSeat1 = EconomyClassSeat.builder()
                .withSeatNumber(1).build();

        businessClassSeats.add(businessClassSeat1);
        economyClassSeats.add(economyClassSeat1);

        List<Food> bMenu = new ArrayList<>();
        List<Food> eMenu = new ArrayList<>();

        Food eal = Food.builder().withName("Eal").withCost(100).build();
        Food banana = Food.builder().withName("Banana").withCost(200).build();

        bMenu.add(banana);
        eMenu.add(eal);

        Map<Customer, Food> bFood = new HashMap<>();
        bFood.put(customer1,banana);

        Airplane airplane =Airplane.builder().withId("12345")
                .withBusinissClassSeats(businessClassSeats)
                .withEconomyClassSeats(economyClassSeats).build();

        List<Airplane> fleat1 = new ArrayList<>();
        fleat1.add(airplane);

        AirLine airLine = AirLine.builder().withName("Airair")
                .withTreasury(50000)
                .withFleat(fleat1).build();

        Trip trip = Trip.builder()
                .withAirLine(airLine)
                .withAirplane(airplane)
                .withBusinessClassMenu(bMenu)
                .withEconomyClassMenu(eMenu)
                .withBookedFood(bFood)
                .withAvaibleBusinessClassSeats(airplane.getBusinessClassSeats())
                .withBookedBusinessClassSeats(new ArrayList<BusinessClassSeat>())
                .withAvalibleEconomiClassSeats(airplane.getEconomyClassSeats())
                .withBookedEconomiClassSeats(new ArrayList<EconomyClassSeat>())
                .withCostForEconomyClassSeat(5000)
                .withCostForBusinessClassSeat(20000)
                .build();
        Assert.assertNotNull(trip.getCostForEconomyClassSeat());



    }



}

