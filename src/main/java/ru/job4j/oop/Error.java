package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void info() {
        System.out.println("Error: " + message);
        System.out.println("Status: " + status);
        System.out.println("Active: " + active);
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        defaultError.info();

        Error filledError = new Error(true, 409, "Conflict");
        filledError.info();
    }
}
