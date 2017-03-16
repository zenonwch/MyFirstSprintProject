package main.java.com.springproject.scope;

public class Message {
    private String message;

    public void printMessage() {
        System.out.println(message);
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
