package com.twu.biblioteca;

public abstract class Manager {
    Checkout checkout;
    Returns returns;

    public void performCheckout(String args){
        checkout.checkOut(args);
    }

    public void performReturn(String args){
        returns.manageReturn(args);
    }

}
