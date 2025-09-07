package com.restAPI.journalApp.service;

import com.restAPI.journalApp.entity.JournalEntry;
import com.restAPI.journalApp.entity.User;
import com.restAPI.journalApp.repository.JournalEntryRepository;
import com.restAPI.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository; //DI on this class

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(User user) {
        userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id) {
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id) {
        userRepository.deleteById(id);
    }

    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    public void deleteByUserName(String username) {
        userRepository.deleteByUserName(username);
    }

}

//controller -> service -> repository
