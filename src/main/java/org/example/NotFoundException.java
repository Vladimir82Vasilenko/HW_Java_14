package org.example;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Элемент с ID: " + id + " не найден");
    }
}
