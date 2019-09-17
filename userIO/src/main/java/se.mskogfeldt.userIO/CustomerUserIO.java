package se.mskogfeldt.userIO;

import se.mskogfeldt.domain.Customer;

import java.util.Scanner;

public class CustomerUserIO {

    private Scanner scanner = new Scanner(System.in);

    public Customer createCustomer{
        String fistName;
        String lastName;
        String ssn;
        System.out.println("Please Enter your first Name");
        fistName = scanner.nextLine();
        System.out.println("Please Enter your first Name");
        lastName = scanner.nextLine();
        ssn = scanner.nextLine();

        CustomerEntity customerEntity = CustomerEntity.builder().withFirstName(fistName)
                .withLastName(lastName).withSsn(ssn).build();

    }

}
