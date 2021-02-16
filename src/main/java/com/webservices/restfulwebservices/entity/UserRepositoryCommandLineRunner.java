//package com.webservices.restfulwebservices.entity;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class UserRepositoryCommandLineRunner implements CommandLineRunner {
//
//    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        User user = new User("Ahmet","Tosun");
//        userRepository.save(user);
//        Optional<User> retrievedUser = userRepository.findById(1L);
//        log.info("New user is created: " + user);
//        log.info("User with Id = 1  " + retrievedUser);
//    }
//}
