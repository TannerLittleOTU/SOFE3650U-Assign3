package net.ontariotechu.controllers;

import net.ontariotechu.models.CashRegister;

// Manual input of a UPC code.
public class Keyboard {

    private CashRegister register;

    public Keyboard(CashRegister register) {
        this.register = register;
    }

    // Saves the UPC code entered by cashier
    public void setUPCCode(String input) {
        this.register.setCurrentProductUPC(input);
    }
}
