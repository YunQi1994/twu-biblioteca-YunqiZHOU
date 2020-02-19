package com.twu.biblioteca;

public class UserVerification {
    private User user;
    private String [][] users;
    public UserVerification (User user){
        this.user = user;
        users = user.getUserLists();
    }



    public boolean isUserExist (String userName) {

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

    public boolean isPasswordCorrect(String password, String userName){
        boolean iscorrect = false;
        String [] userInfo = user.getUser(userName);
        if (password.equals(userInfo[1])){
            // password is correct
            iscorrect = true;
            //System.out.println("pass");
        }
        return iscorrect;
    }

}
