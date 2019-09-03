package se.mskogfeldt.entity;

import java.util.List;
import java.util.Objects;

public class TripEntity {
        private AirplaneEntity plane;
        private List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys;
        private List<BusinessClassSeatEntity> bookedBusinessClassSeatEntitys;
        private List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys;
        private List<EconomyClassSeatEntity> bookedEconomyClassSeatEntitys;
        private int costForBuisnessClassSeat;
        private int costForEkonomyClassSeat;


        public TripEntity(Builder builder){
            this.avalibleBusinessClassSeatEntitys = Objects.requireNonNull(builder.avalibleBusinessClassSeatEntitys);
            this.bookedBusinessClassSeatEntitys = builder.bookedBusinessClassSeatEntitys;
            this.avalibleEconomyClassSeatEntitys = Objects.requireNonNull(builder.avalibleEconomyClassSeatEntitys);
            this.bookedEconomyClassSeatEntitys = builder.bookedEconomyClassSeatEntitys;
            this.costForBuisnessClassSeat = Objects.requireNonNull(builder.costForBuisnessClassSeat);
            this.costForEkonomyClassSeat = Objects.requireNonNull(builder.costForEkonomyClassSeat);

        }

    public AirplaneEntity getPlane() {
        return plane;
    }

    public void setPlane(AirplaneEntity plane) {
        this.plane = plane;
    }

    public List<BusinessClassSeatEntity> getAvaibleBusinessClassSeatEntitys() {
        return avalibleBusinessClassSeatEntitys;
    }

    public void setAvaibleBusinessClassSeatEntitys(List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys) {
        this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
    }

    public List<BusinessClassSeatEntity> getBookedBusinessClassSeatEntitys() {
        return bookedBusinessClassSeatEntitys;
    }

    public void setBookedBusinessClassSeatEntitys(List<BusinessClassSeatEntity> bookedBusinessClassSeatEntitys) {
        this.bookedBusinessClassSeatEntitys = bookedBusinessClassSeatEntitys;
    }

    public List<EconomyClassSeatEntity> getAvalibleEconomyClassSeatEntitys() {
        return avalibleEconomyClassSeatEntitys;
    }

    public void setAvalibleEconomyClassSeatEntitys(List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys) {
        this.avalibleEconomyClassSeatEntitys = avalibleEconomyClassSeatEntitys;
    }

    public List<EconomyClassSeatEntity> getBookedEconomyClassSeatEntitys() {
        return bookedEconomyClassSeatEntitys;
    }

    public void setBookedEconomyClassSeatEntitys(List<EconomyClassSeatEntity> bookedEconomyClassSeatEntitys) {
        this.bookedEconomyClassSeatEntitys = bookedEconomyClassSeatEntitys;
    }

    public int getCostForBuisnessClassSeat() {
        return costForBuisnessClassSeat;
    }

    public void setCostForBuisnessClassSeat(int costForBuisnessClassSeat) {
        this.costForBuisnessClassSeat = costForBuisnessClassSeat;
    }

    public int getCostForEkonomyClassSeat() {
        return costForEkonomyClassSeat;
    }

    public void setCostForEkonomyClassSeat(int costForEkonomyClassSeat) {
        this.costForEkonomyClassSeat = costForEkonomyClassSeat;
    }

    public static Builder builder() {return new Builder();}

    public static class Builder {
        private List<BusinessClassSeatEntity> avalibleBusinessClassSeatEntitys;
        private List<BusinessClassSeatEntity> bookedBusinessClassSeatEntitys;
        private List<EconomyClassSeatEntity> avalibleEconomyClassSeatEntitys;
        private List<EconomyClassSeatEntity> bookedEconomyClassSeatEntitys;
        private int costForBuisnessClassSeat;
        private int costForEkonomyClassSeat;

        public Builder withAvaibleBusinessClassSeats(List<BusinessClassSeatEntity> avalibleBusinessClassSeats){
            this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
            return this;
        }

        public Builder withBookedBusinessClassSeatEntitys(List<BusinessClassSeatEntity> bookedBusinessClassSeats){
            this.avalibleBusinessClassSeatEntitys = avalibleBusinessClassSeatEntitys;
            return this;
        }

        public Builder withAvalibleEconomiClassSeatEntitys(List<EconomyClassSeatEntity> avalibleEconomyClassSeats){
            this.avalibleEconomyClassSeatEntitys = avalibleEconomyClassSeats;
            return this;
        }

        public Builder withBookedEconomiClassSeats(List<EconomyClassSeatEntity> bookedEconomyClassSeats){
            this.avalibleEconomyClassSeatEntitys = avalibleEconomyClassSeatEntitys;
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

        public TripEntity build() {
            return new TripEntity(this);
        }



    }
}
