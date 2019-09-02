package se.mskogfeldt.domain;

import java.util.Objects;

public class EconomyClassSeat {

    private int seatNumber;

    public EconomyClassSeat(Builder builder){
        this.seatNumber = Objects.requireNonNull(builder.seatNumber);

    }

    public int getSeatNumber() {return seatNumber;}

    public static Builder builder() { return new Builder(); }

    public static class Builder{

        private int seatNumber;

        public Builder withSeatNumber(int seatNumber){
            this.seatNumber = seatNumber;
            return this;
        }

        public EconomyClassSeat build() {return new EconomyClassSeat(this);}
    }

}
