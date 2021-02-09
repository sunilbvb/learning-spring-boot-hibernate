package com.learning.hibernate.portal;

import com.learning.hibernate.portal.dao.PersonJdbcDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {

    private final PersonJdbcDao personJdbcDao;

    public ServiceApplication(PersonJdbcDao personJdbcDao) {
        this.personJdbcDao = personJdbcDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("all users -> {} " + personJdbcDao.findAll());

//        System.out.println("get user -> {} " + personJdbcDao.findById(1000));

//        System.out.println("delete user -> {} " + personJdbcDao.deleteById(10002));
    }
}