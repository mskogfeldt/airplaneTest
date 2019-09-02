package se.mskogfeldt.domain;

import java.util.Objects;

public class EconomiClassSeat {

    private int seatNumber;

    public EconomiClassSeat(Builder builder){
        this.seatNumber = Objects.requireNonNull(builder.seatNumber);

    }

    public int getSeatNumber() {return seatNumber}

    public static Builder builder() { return new Builder(); }

    public static class Builder{

        private int seatNumber;

        public Builder withSeatNumber(int seatNumber){
            this.seatNumber = seatNumber;
            return this;
        }

        public EconomiClassSeat build() {return new EconomiClassSeat(this)}
    }

}
