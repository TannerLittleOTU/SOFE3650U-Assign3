package net.ontariotechu.views;

// Prints on paper the scanned or manually entered item name and price
public class TicketPrinter implements ViewInterface {

    // Prints some text on the paper.
    @Override
    public void displayText(String text) {
        System.out.println("Receipt: " + text);
    }
}
