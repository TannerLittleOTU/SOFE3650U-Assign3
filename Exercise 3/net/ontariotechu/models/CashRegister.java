package net.ontariotechu.models;

import net.ontariotechu.ProductDB;
import net.ontariotechu.views.Display;
import net.ontariotechu.views.TicketPrinter;

import java.util.Observable;

// Looks up the price and name of a product based on a UPC
public class CashRegister extends Observable {

    private ProductDB database;

    private Display display;
    private TicketPrinter printer;

    private Product product;

    public CashRegister(ProductDB database) {
        this.database = database;

        // Initialize views
        this.display = new Display();
        this.printer = new TicketPrinter();
    }

    // Sets the UPC code for the current scanned product.
    public void setCurrentProductUPC(String upc) {
        this.product = database.getProduct(upc);
        setChanged();

        // Send information to the views
        notifyObservers(product.toString());
    }

    // Gets the product information for the latest scanned product.
    public Product getCurrentProductInfo() {
        return product;
    }
}
