package se.mskogfeldt.service.impl;

import se.mskogfeldt.domain.*;

import java.util.ArrayList;
import java.util.List;

public class AirLineServiceImpl{




    public void presentFreeSeats(Trip trip) {
        List<BusinessClassSeat> businessClassSeats = trip.getAvalibleBusinessClassSeats();
        List<EconomyClassSeat> economyClassSeats = trip.getAvalibleEconomyClassSeats();
        System.out.println("Avalible Business Class SeatsbusinessClassSeats: " + businessClassSeats);
        System.out.println("Avalible Economy Class SeatsbusinessClassSeats: " + economyClassSeats);
    }

    public void presentMenu(Trip trip) {
        List<Food> businessClassMenu = trip.getBusinessClassMenu();
        List<Food> economyClassMenu = trip.getEconomyClassMenu();
        System.out.println("Business Class Menu: " + businessClassMenu);
        System.out.println("Economy Class Menu: " + businessClassMenu);


    }

    public void takeOff(Trip trip) {

    }

    public void createTicket(Trip trip, Customer customer) {

    }

    public void addAirplane(AirLine airLine, Airplane airplane) {

    }

    /*
    public List<Food> chooseFromMenu(Trip trip, Customer customer){
        presentMenu(trip);
        System.out.println("Do you wish to buy a Item from the menu?");
    }


 */

/*
    public void addFoodToCustomer(Trip trip, Customer customer, List<Food> food){
        List<Food> customersChoice = chooseFromMenu(trip, customer);
        presentMenu(trip);
    }

 */

}
