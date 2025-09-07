package com.restAPI.journalApp.repository;

import com.restAPI.journalApp.entity.JournalEntry;
import com.restAPI.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);

    User deleteByUserName(String username);

}
