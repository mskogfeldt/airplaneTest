package se.mskogfeldt.domain;

import java.util.Objects;

public class Customer  {

    private String firstName;
    private String lastName;
    private String ssn;

    public Customer(Builder builder) {
        this.firstName = Objects.requireNonNull(builder.firstName);
        this.lastName = Objects.requireNonNull(builder.lastName);
        this.ssn = Objects.requireNonNull(builder.ssn);
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

    public static Builder builder() { return new Builder(); }

    public static class Builder{

        private String firstName;
        private String lastName;
        private String ssn;

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

    public Customer build(){
        return new Customer(this);
    }

    }

}
