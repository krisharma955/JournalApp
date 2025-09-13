package com.restAPI.journalApp.service;

import com.restAPI.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @ParameterizedTest
    @ValueSource(strings = {
            "Lando",
            "Sharma"
    })
    public void testFindByUsername(String username) {
        assertNotNull(userRepository.findByUserName(username));
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "3,6,8",
            "3,2,1"
    })
    public void test(int expected, int a, int b) {
        assertEquals(expected, a+b);
    }

}
