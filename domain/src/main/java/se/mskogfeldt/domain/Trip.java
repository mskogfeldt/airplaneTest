package se.mskogfeldt.domain;

import java.util.List;
import java.util.Objects;

public class Trip {
    private Airplane plane;
    private List<Integer> avaibleBusinessClassSeats;
    private List<Integer> bookedBusinessClassSeats;
    private List<Integer> avalibleEconomiClassSeats;
    private List<Integer> bookedEconomiClassSeats;
    private int costForBuisnessClassSeat;
    private int costForEkonomyClassSeat;

    // plane.getBusnessClassSeats();
    public Trip(Builder builder) {
        this.avaibleBusinessClassSeats = Objects.requireNonNull(builder.avalibleBusinessClassSeats);
        this.bookedBusinessClassSeats = Objects.requireNonNull(builder.bookedBusinessClassSeats);
        this.avalibleEconomiClassSeats = Objects.requireNonNull(builder.avalibleEconomiClassSeats);
        this.bookedEconomiClassSeats = Objects.requireNonNull(builder.bookedEconomiClassSeats);
        this.costForBuisnessClassSeat = Objects.requireNonNull(builder.costForBuisnessClassSeat);
        this.costForEkonomyClassSeat = Objects.requireNonNull(builder.costForEkonomyClassSeat);

    }

    public Airplane getPlane() {
        return plane;
    }

    public List<Integer> getAvalibleBusinessClassSeats() {
        return avaibleBusinessClassSeats;
    }

    public List<Integer> getBookedBusinessClassSeats() {
        return bookedBusinessClassSeats;
    }

    public List<Integer> getAvalibleEconomiClassSeats() {
        return avalibleEconomiClassSeats;
    }

    public List<Integer> getBookedEconomiClassSeats() {
        return bookedEconomiClassSeats;
    }

    public int getCostForBuisnessClassSeat() {
        return costForBuisnessClassSeat;
    }

    public int getCostForEkonomyClassSeat() {
        return costForEkonomyClassSeat;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private List<Integer> avalibleBusinessClassSeats;
        private List<Integer> bookedBusinessClassSeats;
        private List<Integer> avalibleEconomiClassSeats;
        private List<Integer> bookedEconomiClassSeats;
        private int costForBuisnessClassSeat;
        private int costForEkonomyClassSeat;

        public Builder withAvaibleBusinessClassSeats(List<Integer> avalibleBusinessClassSeats){
            this.avalibleBusinessClassSeats = avalibleBusinessClassSeats;
            return this;
        }

        public Builder withBookedBusinessClassSeats(List<Integer> bookedBusinessClassSeats){
            this.avalibleBusinessClassSeats = avalibleBusinessClassSeats;
            return this;
        }

        public Builder withAvalibleEconomiClassSeats(List<Integer> avalibleEconomiClassSeats){
            this.avalibleEconomiClassSeats = avalibleEconomiClassSeats;
            return this;
        }

        public Builder withBookedEconomiClassSeats(List<Integer> bookedEconomiClassSeats){
            this.avalibleEconomiClassSeats = avalibleEconomiClassSeats;
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
