package se.mskogfeldt.entity;

import java.util.Objects;

public class CustomerEntity {

    private String firstName;
    private String lastName;
    private String ssn;

    public CustomerEntity(Builder builder) {
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String ssn;

    }

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

    public CustomerEntity build(){
        return new CustomerEntity(this);
    }

}


