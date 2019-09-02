package se.mskogfeldt.domain;

import java.util.List;
import java.util.Objects;

public class Airplane {

    //private String name;
    private String id;
    private List<EconomiClassSeat> economiClassSeats;
    private List<BusinessClassSeat> businessClassSeats;

    public Airplane(Builder builder) {
        this.id = Objects.requireNonNull(builder.id);
        //this.name = Objects.requireNonNull(builder.name);
        this.businessClassSeats = builder.businessClassSeats;
        this.economiClassSeats = builder.economiClassSeats;
    }


    public String getId() {
        return id;
    }

   /* public String getName() {
        return name;
    }

    */

    public List<BusinessClassSeat> getBuisnissClassSeats() {
        return businessClassSeats;
    }

    public List<EconomiClassSeat> getEconomiClassSeats() {
        return economiClassSeats;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder{

        private String id;
        private String name;
        private List<EconomiClassSeat> economiClassSeats;
        private List<BusinessClassSeat> businessClassSeats;

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withEconomiClassSeats(List<EconomiClassSeat> economiClassSeats) {
            this.economiClassSeats = economiClassSeats;
            return this;
        }

        public Builder withBuisnissClassSeats(List<BusinessClassSeat> buisnissClassSeats) {
            this.businessClassSeats = buisnissClassSeats;
            return this;
        }

        public Airplane build() {
            return new Airplane(this);
        }


    }

}

