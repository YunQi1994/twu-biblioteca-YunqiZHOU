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
    public void shouldReturnTrueWhenUserIsExist (){
        String userName = "client1";
        assertTrue(userVerification.isUserExist(userName));
    }
}