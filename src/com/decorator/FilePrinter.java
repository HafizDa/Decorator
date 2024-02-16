package com.decorator;

public class FilePrinter implements Printer{
    private Printer wrappedPrinter;

    public FilePrinter(Printer wrappedPrinter) {
        this.wrappedPrinter = wrappedPrinter;
    }

    @Override
    public void print(String message) {
        System.out.println("Printing to file: " + message);
    }
}
