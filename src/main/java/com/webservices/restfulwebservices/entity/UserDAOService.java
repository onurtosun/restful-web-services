//package com.webservices.restfulwebservices.entity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
//@Repository
//@Transactional
//
//public class UserDAOService {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public long insert(User user){
//        entityManager.persist(user);
//        return user.getId();
//    }
//
//}
