package se.mskogfeldt.entity;

import java.util.Objects;

public class BusinessClassSeatEntity {

    private int seatNumber;

    public BusinessClassSeatEntity(Builder builder) {
        this.seatNumber = Objects.requireNonNull(builder.seatNumber);

    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int seatNumber;

        public Builder withSeatnumber(int seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }
        public BusinessClassSeatEntity build() {
            return new BusinessClassSeatEntity(this);}

    }
}
