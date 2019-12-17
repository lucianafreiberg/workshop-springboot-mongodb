package com.freiberg.workshopmongo.services;

import com.freiberg.workshopmongo.domain.User;
import com.freiberg.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
@Autowired
private UserRepository repo;
    public List<User> findAll(){
        return repo.findAll();

    }
}
