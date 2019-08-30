package se.mskogfeldt.test.domain;

import org.junit.Assert;
import org.junit.Test;
import se.mskogfeldt.domain.Airplane;
import se.mskogfeldt.domain.Customer;
import se.mskogfeldt.domain.Trip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class DomainTest {

    @Test
    public void testCreatingCustomer() {
        Customer customer = Customer.builder().withFirstName("Adam").withLastName("Abdersson").withSsn("12345").build();
        Assert.assertNotNull(customer.getFirstName());
    }

    @Test
    public void testCreatingAirplane() {
        Airplane airplane = Airplane.builder().withName("falcon").withId("12345")
                .withBuisnissClassSeats(Arrays.asList(1,2,3,4,5)).withEconomiClassSeats(Arrays.asList(6,7,8,9,10)).build();
        Assert.assertNotNull(airplane.getName());
    }

    @Test
    public void testCreatingTrip() {
        Airplane airplane = Airplane.builder().withName("falcon").withId("12345")
                .withBuisnissClassSeats(Arrays.asList(1,2,3,4,5)).withEconomiClassSeats(Arrays.asList(6,7,8,9,10)).build();
    //    Assert.assertNotNull(airplane.getName());
        Trip trip = Trip.builder().withAvaibleBusinessClassSeats(airplane.getBuisnissClassSeats())
                .withBookedBusinessClassSeats(new ArrayList<Integer>())
                .withAvalibleEconomiClassSeats(airplane.getEconomiClassSeats())
                .withBookedEconomiClassSeats(new ArrayList<Integer>())
                .withCostForEkonomyClassSeat(5000)
                .withCostForBuisnessClassSeat(20000)
                .build();
        Assert.assertNotNull(trip.getCostForEkonomyClassSeat());
    }

}

