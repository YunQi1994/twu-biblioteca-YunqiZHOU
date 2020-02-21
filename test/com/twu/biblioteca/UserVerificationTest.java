package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserVerificationTest {
    private UserVerification userVerification;
    private User testUser;
    @Before
    public void setUp (){
        testUser = new User();
        userVerification = new UserVerification(testUser);

    }

    @Test
    public void shouldReturnTrueWhenUserDoesExist (){
        String userName = "client1";
        assertTrue(userVerification.isUserExist(userName));
    }

    @Test
    public void shouldReturnFalseWhenUserDoseNotExist (){
        String userName = "client10";
        assertFalse(userVerification.isUserExist(userName));
    }

    @Test
    public void shouldReturnTureWhenPasswordDoesMatch(){
        String userName = "client1";
        String password = "zxc123";
        assertTrue(userVerification.isPasswordCorrect(password,userName));
    }

    @Test
    public void shouldReturnFalseWhenPasswordDoesNotMatch(){
        String userName = "client1";
        String password = "zxc1231";
        assertFalse(userVerification.isPasswordCorrect(password,userName));
    }

    @Test
    public void shouldLogUserOn(){
        String userName = "client2";
        String expect = "onLine";
        testUser.userLogin(userName);
        String actual = testUser.getUser(userName)[2];

        assertEquals(expect,actual);
    }
}