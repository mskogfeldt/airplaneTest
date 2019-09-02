package se.mskogfeldt.test.domain;

import org.junit.Assert;
import org.junit.Test;
import se.mskogfeldt.domain.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DomainTest {

    @Test
    public void testCreatingCustomer() {
        Customer customer = Customer.builder().withFirstName("Adam").withLastName("Abdersson").withSsn("12345").build();
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

        Trip trip = Trip.builder().withAvaibleBusinessClassSeats(airplane.getBusinessClassSeats())
                .withBookedBusinessClassSeats(new ArrayList<BuisnessClassSeats>())
                .withAvalibleEconomiClassSeats(airplane.getEconomyClassSeats())
                .withBookedEconomiClassSeats(new ArrayList<EconomyClassSeat>())
                .withCostForEkonomyClassSeat(5000)
                .withCostForBuisnessClassSeat(20000)
                .build();
        Assert.assertNotNull(trip.getCostForEkonomyClassSeat());
    }



}

