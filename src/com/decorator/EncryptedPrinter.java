package com.decorator;

public class EncryptedPrinter implements Printer{
    private Printer wrappedPrinter;

    public EncryptedPrinter(Printer wrappedPrinter) {
        this.wrappedPrinter = wrappedPrinter;
    }

    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        System.out.println("Printing encrypted message: " + encryptedMessage);
    }
    private String encrypt(String message) {
        return "Encrypted: " + message;
    }
}
