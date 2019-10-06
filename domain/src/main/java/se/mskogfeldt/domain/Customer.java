package se.mskogfeldt.domain;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Customer  {

    private String firstName;
    private String lastName;
    private String ssn;
    private Map<String, Trip> trips;

    public Customer(Builder builder) {
        this.firstName = Objects.requireNonNull(builder.firstName);
        this.lastName = Objects.requireNonNull(builder.lastName);
        this.ssn = Objects.requireNonNull(builder.ssn);
        this.trips = builder.trips;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public Map<String, Trip> getTrips() {
        return trips;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder{

        private String firstName;
        private String lastName;
        private String ssn;
        private Map<String, Trip> trips;

    public Builder withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public Builder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public Builder withSsn(String ssn){
        this.ssn = ssn;
        return this;
    }

    public Builder withTrips(Map<String, Trip> trips){
        this.trips = trips;
        return this;
    }

    public Customer build(){
        return new Customer(this);
    }

    }

}
