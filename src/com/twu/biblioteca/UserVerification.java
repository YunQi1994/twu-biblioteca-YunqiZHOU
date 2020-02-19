package com.twu.biblioteca;

public class UserVerification {
    private User user;

    public UserVerification (User user){
        this.user = user;
    }



    public boolean isUserExist (String userName) {
        String [][] users = user.getUserLists();
        boolean isExist = false;
        for (String [] user : users){
            if (userName.equals(user[0])){
                // user found
                isExist = true;
                break;
            }
        }
        return isExist;
    }
}
