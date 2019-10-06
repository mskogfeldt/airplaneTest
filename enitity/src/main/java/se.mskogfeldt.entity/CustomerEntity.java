package se.mskogfeldt.entity;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CustomerEntity {

    private String firstName;
    private String lastName;
    private String ssn;
    private Map<String, TripEntity> tripEntitys;

    public CustomerEntity(Builder builder) {
        this.firstName = Objects.requireNonNull(builder.firstName,"firstname");
        this.lastName = Objects.requireNonNull(builder.lastName,"lastname");
        this.ssn = Objects.requireNonNull(builder.ssn,"ssn");
        this.tripEntitys = builder.tripEntitys;
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

    public Map<String, TripEntity> getTripEntitys() {return tripEntitys;}

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String ssn;
        private Map<String, TripEntity> tripEntitys;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withSsn(String ssn) {
            this.ssn = ssn;
            return this;
        }

        public Builder withTripEntitys(Map<String, TripEntity> tripEntitys){
            this.tripEntitys = tripEntitys;
            return this;
        }

        public CustomerEntity build() {
            return new CustomerEntity(this);
        }

    }

}


