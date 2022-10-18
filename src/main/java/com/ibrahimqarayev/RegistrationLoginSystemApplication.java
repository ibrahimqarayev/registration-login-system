package com.ibrahimqarayev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

@SpringBootApplication
public class RegistrationLoginSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationLoginSystemApplication.class, args);
    }

}
