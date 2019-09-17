package se.mskogfeldt.service.impl;

import se.mskogfeldt.domain.Customer;
import se.mskogfeldt.domain.Food;
import se.mskogfeldt.domain.Trip;
import se.mskogfeldt.service.TripService;

import java.util.List;

public class TripServiceImpl implements TripService {



    public void addCustomerToMapOfFood(Trip trip, Customer customer, List<Food> food) {
        trip.getBookedFood().put(customer, food);
    }

    public List<Food> addFoodToList(Food food, List<Food> list){
        list.add(food);
        return list;
    }

    public List<Food>removeFoodFromList(Food food, List<Food> list){
        list.add(food);
        return list;
    }

/*
    public List<Food> editFoodToCustomersOrder(List<Food> food){
        List<Food> newFood =

    }

 */

    public void bookFlight(Trip trip, Customer customer) {

    }

    public void removeCustomerFromBookedFood(Trip trip, Customer customer){
        trip.getBookedFood().remove(customer);
    }

    public void removeCustomerFromEconomyClassSeats(Trip trip, Customer customer){
        trip.getBookedEconomyClassSeats().remove(customer);
    }

    public void removeCustomerFromBusinessClassSeats(Trip trip, Customer customer){
        trip.getBookedBusinessClassSeats().remove(customer);
    }
}
