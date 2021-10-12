package net.ontariotechu;

import net.ontariotechu.controllers.Keyboard;
import net.ontariotechu.controllers.Scanner;
import net.ontariotechu.models.CashRegister;
import net.ontariotechu.views.Display;
import net.ontariotechu.views.TicketPrinter;

public class Main {

    public static void main(String[] args) {
        // Simulate cash register interaction for demonstration.
        ProductDB database = new ProductDB();
        database.initialize();

        CashRegister register = new CashRegister(database);

        Display observer1 = new Display();

        TicketPrinter observer2 = new TicketPrinter();
        register.addObserver(observer1);
        register.addObserver(observer2);


        register.setCurrentProductUPC("777");



        Keyboard keyboard = new Keyboard(register);
        Scanner scanner = new Scanner(register);
/**
        keyboard.setUPCCode("012345678912");
        keyboard.setUPCCode("201234567899");
        scanner.setUPCCode("512345000107");
        scanner.setUPCCode("401234567893"); **/
    }
}
