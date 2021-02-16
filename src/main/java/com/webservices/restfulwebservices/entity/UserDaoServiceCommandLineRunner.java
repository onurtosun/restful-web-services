//package com.webservices.restfulwebservices.entity;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
//
//    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
//    @Autowired
//    UserDAOService userDAOService;
//
//    @Override
//    public void run(String... args) throws Exception {
//        User user = new User("Onur","Tosun");
//        userDAOService.insert(user);
//        log.info("New user is created: " + user);
//    }
//}
