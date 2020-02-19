package com.twu.biblioteca;

public class User {

    private static String [][] users = {
            {"client1", "zxc123", "offLine", "", "Name: Bridget", "Phone: 111-1111-1111", "Email: bridget111@gmail.com"},
            {"client2", "asd456", "offLine", "", "Name: Bridie", "Phone: 222-2222-2222", "Email: bridget111@gmail.com"},
            {"client3", "qwe789", "offLine", "", "Name: Biddy", "Phone: 333-3333-3333", "Email: bridget111@gmail.com"}
    };

    public String[][] getUserLists (){
        return users;
    }



    public String[] getUser(String userName) {
        String [] result = new String[users[0].length];
        result[0] = "ERROR!";
        for (String[] user : users){
            if (userName.equals(user[0])){
                result =  user;
                break;
            }
        }
        return result;
    }





    public void userLogin (String userName){
        getUser(userName)[2] = "onLine";
    }


    public void recordBookCheckout(String bookName, String userName) {
        bookName = "<" + bookName + ">";
        for (int i = 0; i < users.length; i++){
            if (users[i][0].equals(userName)){
                users[i][3] += bookName;
            }
        }
    }
}
