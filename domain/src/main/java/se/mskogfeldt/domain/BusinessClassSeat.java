package se.mskogfeldt.domain;

import java.util.Objects;

public class BusinessClassSeat {

    private int seatNumber;

    public BusinessClassSeat(Builder builder){
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

        public BusinessClassSeat build() { return new BusinessClassSeat(this);}
    }

}
