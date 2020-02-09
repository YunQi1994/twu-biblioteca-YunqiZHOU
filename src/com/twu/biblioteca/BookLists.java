package com.twu.biblioteca;

import java.util.Arrays;

public class BookLists {
    private String[][] bookList = {
            {"book1", "Author: Hugh", "YearOfPub: 2001"},
            {"book2", "Author: Jack", "YearOfPub: 2002"},
            {"book3", "Author: Man", "YearOfPub: 2003"}};

    public String[][] getBookList() {
        return bookList;
    }

    public void checkOutABook(String bookTitle) {
        int len = bookList.length;
        String[][] newBookList = new String[len-1][3];
        int i = 0;
        for (String[] str : bookList){
            if (!bookTitle.equals(str[0])){
                //System.out.println("111111");
                newBookList[i] = str;
                i ++;
            }
        }
        bookList = newBookList;
    }


}
