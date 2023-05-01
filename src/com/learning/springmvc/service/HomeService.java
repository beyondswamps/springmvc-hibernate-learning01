package com.learning.springmvc.service;

import com.learning.springmvc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HomeService {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public String getUser() {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, 1);
        return user.getName();
    }
}
