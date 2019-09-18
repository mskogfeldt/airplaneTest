package se.mskogfeldt.userIO;

import se.mskogfeldt.domain.Customer;
import se.mskogfeldt.entity.CustomerEntity;

import java.util.Scanner;

public class CustomerUserIO {

    private Scanner scanner = new Scanner(System.in);

    public String writeFirstName(){
        String firstName;
        System.out.println("Please Enter your first Name");
        firstName = scanner.nextLine();
        return firstName;
    }

    public String writeSecondName(){
        String secondName;
        System.out.println("Please Enter your second Name");
        secondName = scanner.nextLine();
        return secondName;
    }

    public String writeSsn(){
        String ssn;
        System.out.println("Please Enter your social security number");
        ssn = scanner.nextLine();
        return ssn;
    }

        /*CustomerEntity customerEntity = CustomerEntity.builder().withFirstName(fistName)
                .withLastName(lastName).withSsn(ssn).build();*/

}
