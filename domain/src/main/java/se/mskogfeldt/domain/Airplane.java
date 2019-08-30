package se.mskogfeldt.domain;

import java.util.List;
import java.util.Objects;

public class Airplane {

    private String name;
    private String id;
    private List<Integer> economiClassSeats;
    private List<Integer> businessClassSeats;

    public Airplane(Builder builder) {
        this.id = Objects.requireNonNull(builder.id);
        this.name = Objects.requireNonNull(builder.name);
        this.businessClassSeats = Objects.requireNonNull(builder.businessClassSeats);
        this.economiClassSeats = Objects.requireNonNull(builder.economiClassSeats);
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getEconomiClassSeats() {
        return economiClassSeats;
    }

    public List<Integer> getBuisnissClassSeats() {
        return businessClassSeats;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder{

        private String id;
        private String name;
        private List<Integer> economiClassSeats;
        private List<Integer> businessClassSeats;

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withEconomiClassSeats(List<Integer> economiClassSeats) {
            this.economiClassSeats = economiClassSeats;
            return this;
        }

        public Builder withBuisnissClassSeats(List<Integer> buisnissClassSeats) {
            this.businessClassSeats = buisnissClassSeats;
            return this;
        }

        public Airplane build() {
            return new Airplane(this);
        }


    }

}

