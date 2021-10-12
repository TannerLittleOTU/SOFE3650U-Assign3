package net.ontariotechu.views;

// Is a graphical display of scanned or manually entered item name and price
public class Display implements ViewInterface {

    // Displays some text on the screen.
    @Override
    public void displayText(String text) {
        System.out.println("Display: " + text);
    }
}
