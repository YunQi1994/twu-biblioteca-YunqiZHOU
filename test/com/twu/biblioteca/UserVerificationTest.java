package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.tools.tree.NewArrayExpression;

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
        String password = "zxc123";
        assertTrue(userVerification.isPasswordCorrect(password));
    }

    @Test
    public void shouldReturnFalseWhenPasswordDoesNotMatch(){
        String password = "zxc1231";
        assertFalse(userVerification.isPasswordCorrect(password));
    }
}