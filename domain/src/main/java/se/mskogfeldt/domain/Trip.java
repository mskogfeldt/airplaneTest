package se.mskogfeldt.domain;

import java.util.List;
import java.util.Objects;

public class Trip {
    private Airplane plane;
    private List<BusinessClassSeat> avaibleBusinessClassSeats;
    private List<BusinessClassSeat> bookedBusinessClassSeats;
    private List<EconomyClassSeat> avalibleEconomyClassSeats;
    private List<EconomyClassSeat> bookedEconomyClassSeats;
    private int costForBuisnessClassSeat;
    private int costForEkonomyClassSeat;

    // plane.getBusnessClassSeats();
    public Trip(Builder builder) {
        this.avaibleBusinessClassSeats = Objects.requireNonNull(builder.avalibleBusinessClassSeats);
        this.bookedBusinessClassSeats = builder.bookedBusinessClassSeats;
        this.avalibleEconomyClassSeats = Objects.requireNonNull(builder.avalibleEconomyClassSeats);
        this.bookedEconomyClassSeats = builder.bookedEconomyClassSeats;
        this.costForBuisnessClassSeat = Objects.requireNonNull(builder.costForBuisnessClassSeat);
        this.costForEkonomyClassSeat = Objects.requireNonNull(builder.costForEkonomyClassSeat);

    }

    public Airplane getPlane() {
        return plane;
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
        return costForBuisnessClassSeat;
    }

    public int getCostForEkonomyClassSeat() {
        return costForEkonomyClassSeat;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private List<BusinessClassSeat> avalibleBusinessClassSeats;
        private List<BusinessClassSeat> bookedBusinessClassSeats;
        private List<EconomyClassSeat> avalibleEconomyClassSeats;
        private List<EconomyClassSeat> bookedEconomyClassSeats;
        private int costForBuisnessClassSeat;
        private int costForEkonomyClassSeat;

        public Builder withAvaibleBusinessClassSeats(List<BusinessClassSeat> avalibleBusinessClassSeats){
            this.avalibleBusinessClassSeats = avalibleBusinessClassSeats;
            return this;
        }

        public Builder withBookedBusinessClassSeats(List<BuisnessClassSeats> bookedBusinessClassSeats){
            this.avalibleBusinessClassSeats = avalibleBusinessClassSeats;
            return this;
        }

        public Builder withAvalibleEconomiClassSeats(List<EconomyClassSeat> avalibleEconomyClassSeats){
            this.avalibleEconomyClassSeats = avalibleEconomyClassSeats;
            return this;
        }

        public Builder withBookedEconomiClassSeats(List<EconomyClassSeat> bookedEconomyClassSeats){
            this.avalibleEconomyClassSeats = avalibleEconomyClassSeats;
            return this;
        }

        public Builder withCostForBuisnessClassSeat(int costForBuisnessClassSeat){
            this.costForBuisnessClassSeat = costForBuisnessClassSeat;
            return this;

        }

        public Builder withCostForEkonomyClassSeat(int costForEkonomyClassSeat){
            this.costForBuisnessClassSeat = costForBuisnessClassSeat;
            return this;

            }

        public Trip build() {
            return new Trip(this);
        }

    }
}
