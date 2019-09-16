package se.mskogfeldt.domain;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Trip {

    private Airplane airplane;
    private AirLine airLine;


    private List<Food> businessClassMenu;
    private List<Food> economyClassMenu;

    private Map<Customer, List<Food>> bookedFood;

    private List<BusinessClassSeat> avaibleBusinessClassSeats;
    private Map<Integer, Customer> bookedBusinessClassSeats;

    private List<EconomyClassSeat> avalibleEconomyClassSeats;
    private Map<Integer, Customer> bookedEconomyClassSeats;

    private int costForBusinessClassSeat;
    private int costForEconomyClassSeat;


    public Trip(Builder builder) {
        this.airLine = Objects.requireNonNull(builder.airLine);


        this.airplane = Objects.requireNonNull(builder.airplane);

        this.bookedFood = builder.bookedFood;

        this.businessClassMenu = Objects.requireNonNull(builder.businessClassMenu);
        this.economyClassMenu = Objects.requireNonNull(builder.economyClassMenu);

        this.avaibleBusinessClassSeats = Objects.requireNonNull(builder.avalibleBusinessClassSeats);
        this.bookedBusinessClassSeats = builder.bookedBusinessClassSeats;

        this.avalibleEconomyClassSeats = Objects.requireNonNull(builder.avalibleEconomyClassSeats);
        this.bookedEconomyClassSeats = builder.bookedEconomyClassSeats;

        this.costForBusinessClassSeat = Objects.requireNonNull(builder.costForBusinessClassSeat);
        this.costForEconomyClassSeat = Objects.requireNonNull(builder.costForEconomyClassSeat);

    }

    public Airplane getAirplane() {
        return airplane;
    }

    public List<Food> getBusinessClassMenu() {
        return businessClassMenu;
    }

    public List<Food> getEconomyClassMenu() {
        return economyClassMenu;
    }

    public Map<Customer, List<Food>> getBookedFood() {
        return bookedFood;
    }


    public List<BusinessClassSeat> getAvalibleBusinessClassSeats() {
        return avaibleBusinessClassSeats;
    }

    public Map<Integer, Customer> getBookedBusinessClassSeats() {
        return bookedBusinessClassSeats;
    }

    public List<EconomyClassSeat> getAvalibleEconomyClassSeats() {
        return avalibleEconomyClassSeats;
    }

    public Map<Integer, Customer> getBookedEconomyClassSeats() {
        return bookedEconomyClassSeats;
    }

    public int getCostForBusinessClassSeat() {
        return costForBusinessClassSeat;
    }

    public int getCostForEconomyClassSeat() {
        return costForEconomyClassSeat;
    }

    public AirLine getAirLine() {
        return airLine;
    }




    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private AirLine airLine;
        private Airplane airplane;

        private List<Food> businessClassMenu;
        private List<Food> economyClassMenu;

        private Map<Customer, List<Food>> bookedFood;

        private List<BusinessClassSeat> avalibleBusinessClassSeats;
        private Map<Integer, Customer> bookedBusinessClassSeats;

        private List<EconomyClassSeat> avalibleEconomyClassSeats;
        private Map<Integer, Customer> bookedEconomyClassSeats;

        private int costForBusinessClassSeat;
        private int costForEconomyClassSeat;

        public  Builder withAirLine(AirLine airLine){
            this.airLine = airLine;
            return this;
        }



        public Builder withAirplane(Airplane airplane) {
            this.airplane = airplane;
            return this;
        }

        public Builder withBusinessClassMenu(List<Food> businessClassMenu) {
            this.businessClassMenu = businessClassMenu;
            return this;
        }

        public Builder withEconomyClassMenu(List<Food> economyClassMenu) {
            this.economyClassMenu = economyClassMenu;
            return this;
        }


        public Builder withBookedFood(Map<Customer, List<Food>> bookedFood) {
            this.bookedFood = bookedFood;
            return this;
        }

        public Builder withAvaibleBusinessClassSeats(List<BusinessClassSeat> avalibleBusinessClassSeats) {
            this.avalibleBusinessClassSeats = avalibleBusinessClassSeats;
            return this;
        }

        public Builder withBookedBusinessClassSeats(Map<Integer, Customer> bookedBusinessClassSeats) {
            this.bookedBusinessClassSeats = bookedBusinessClassSeats;
            return this;
        }

        public Builder withAvalibleEconomiClassSeats(List<EconomyClassSeat> avalibleEconomyClassSeats) {
            this.avalibleEconomyClassSeats = avalibleEconomyClassSeats;
            return this;
        }

        public Builder withBookedEconomiClassSeats(Map<Integer, Customer> bookedEconomyClassSeats) {
            this.bookedEconomyClassSeats = bookedEconomyClassSeats;
            return this;
        }

        public Builder withCostForBusinessClassSeat(int costForBusinessClassSeat) {
            this.costForBusinessClassSeat = costForBusinessClassSeat;
            return this;

        }

        public Builder withCostForEconomyClassSeat(int costForEconomyClassSeat) {
            this.costForEconomyClassSeat = costForEconomyClassSeat;
            return this;

        }

        public Trip build() {
            return new Trip(this);
        }

    }
}
