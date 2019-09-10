package se.mskogfeldt.domain;

import java.util.List;
import java.util.Objects;

public class Trip {

    private Airplane airplane;
    private AirLine airLine;

    private List<Food> businessClassMenu;
    private List<Food> economyClassMenu;

    private List<BusinessClassSeat> avaibleBusinessClassSeats;
    private List<BusinessClassSeat> bookedBusinessClassSeats;

    private List<EconomyClassSeat> avalibleEconomyClassSeats;
    private List<EconomyClassSeat> bookedEconomyClassSeats;

    private int costForBusinessClassSeat;
    private int costForEconomyClassSeat;

    // plane.getBusnessClassSeats();
    public Trip(Builder builder) {
        this.

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

    public List<BusinessClassSeat> getAvalibleBusinessClassSeats() {
        return avaibleBusinessClassSeats;
    }

    public List<BusinessClassSeat> getBookedBusinessClassSeats() {
        return bookedBusinessClassSeats;
    }

    public List<EconomyClassSeat> getAvalibleEconomyClassSeats() {
        return avalibleEconomyClassSeats;
    }

    public List<EconomyClassSeat> getBookedEconomyClassSeats() {
        return bookedEconomyClassSeats;
    }

    public int getCostForBuisnessClassSeat() {
        return costForBusinessClassSeat;
    }

    public int getCostForEkonomyClassSeat() {
        return costForEconomyClassSeat;
    }

    public AirLine getAirLine() {
        return airLine;
    }

    public List<Food> getBusinessClassMenu() {
        return businessClassMenu;
    }

    public List<Food> getEconomyClassMenu() {
        return economyClassMenu;
    }

    public List<BusinessClassSeat> getAvaibleBusinessClassSeats() {
        return avaibleBusinessClassSeats;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private AirLine airLine;
        private Airplane airplane;

        private List<BusinessClassSeat> avalibleBusinessClassSeats;
        private List<BusinessClassSeat> bookedBusinessClassSeats;

        private List<EconomyClassSeat> avalibleEconomyClassSeats;
        private List<EconomyClassSeat> bookedEconomyClassSeats;

        private int costForBusinessClassSeat;
        private int costForEconomyClassSeat;

        public  Builder withAirLine(AirLine airLine){
            this.airLine = airLine;
            return this;
        }

        public Builder withAirplane(Airplane airplane){
            this.airplane = airplane;
            return this;
        }

        public Builder withAvaibleBusinessClassSeats(List<BusinessClassSeat> avalibleBusinessClassSeats){
            this.avalibleBusinessClassSeats = avalibleBusinessClassSeats;
            return this;
        }

        public Builder withBookedBusinessClassSeats(List<BusinessClassSeat> bookedBusinessClassSeats){
            this.bookedBusinessClassSeats = bookedBusinessClassSeats;
            return this;
        }

        public Builder withAvalibleEconomiClassSeats(List<EconomyClassSeat> avalibleEconomyClassSeats){
            this.avalibleEconomyClassSeats = avalibleEconomyClassSeats;
            return this;
        }

        public Builder withBookedEconomiClassSeats(List<EconomyClassSeat> bookedEconomyClassSeats){
            this.bookedEconomyClassSeats = bookedEconomyClassSeats;
            return this;
        }

        public Builder withCostForBuisnessClassSeat(int costForBusinessClassSeat){
            this.costForBusinessClassSeat = costForBusinessClassSeat;
            return this;

        }

        public Builder withCostForEconomyClassSeat(int costForEconomyClassSeat){
            this.costForEconomyClassSeat = costForEconomyClassSeat;
            return this;

            }

        public Trip build() {
            return new Trip(this);
        }

    }
}
