package com.twu.biblioteca;

import java.util.Arrays;

public class BookLists {
    private static String[][] bookList = {
            {"book1", "Author: Hugh", "YearOfPub: 2001","available"},
            {"book2", "Author: Jack", "YearOfPub: 2002","available"},
            {"book3", "Author: Man", "YearOfPub: 2003","available"}};



    public String[][] getBookList() {
        return bookList;
    }

    public void checkOutABook(String bookTitle) {

        for (int i = 0; i<bookList.length; i++){
            if (bookTitle.equals(bookList[i][0])){
                // check as borrowed
                bookList[i][3] = "borrowed";
            }
        }
    }

    public boolean isAvailable(String bookTitle) {
        // not available 或者无效输入都将为false
        boolean availability  = false;
        String[] bookTitles = new String[bookList.length];
        for (String[] str : bookList) {
            if (bookTitle.equals(str[0]) && "available".equals(str[3])) {
                availability = true;
                break;
            }

        }
        return availability;
    }

    public void returnABook(String bookTitle) {
        for (int i = 0; i<bookList.length; i++){
            if (bookTitle.equals(bookList[i][0])){
                // check as available
                bookList[i][3] = "available";
            }
        }
    }

    public boolean doesTheBookBelongToTheLibrary(String bookTitle) {
        boolean isBookBelongToTheLibrary  = false;
        String[] bookTitles = new String[bookList.length];
        for (String[] str : bookList) {
            if (bookTitle.equals(str[0])) {
                isBookBelongToTheLibrary = true;
                break;
            }

        }
        return isBookBelongToTheLibrary;
    }

}
