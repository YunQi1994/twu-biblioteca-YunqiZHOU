package com.twu.biblioteca;

public class User {

    private static String [][] users = {
            {"client1", "zxc123", "offLine"},
            {"client2", "asd456", "offLine"},
            {"client3", "qwe789", "offLine"},
    };

    private static boolean isUserExist (String userName) {
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

    public String[] getUser(String client1) {
        String [] result = new String[users[0].length];
        result[0] = "ERROR!";
        for (String[] user : users){
            if (client1.equals(user[0])){
                result =  user;
                break;
            }
        }
        return result;
    }

    public boolean isUserNameAndPasswordCorrect(String userName, String password) {
        boolean isVerified = false;
        for (String [] user : users){
            if (isUserExist(userName)){
                // user found
                if (password.equals(user[1])){
                    // password is correct
                    isVerified = true;
                    break;
                }
                else{
                    System.out.println("Sorry, the password is not correct\n");
                    break;
                }
            }
            else {
                System.out.println("Sorry, user not found\n");
            }
        }
        return isVerified;
    }

    public void userLogin (String userName, String password){

        if (isUserNameAndPasswordCorrect(userName,password)){
            getUser(userName)[2] = "onLine";
        }
    }



}
