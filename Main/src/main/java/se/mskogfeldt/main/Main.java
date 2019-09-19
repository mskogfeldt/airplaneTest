package se.mskogfeldt.main;



import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("dao-impl.xml");
    }
}
