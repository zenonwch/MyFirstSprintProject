package main.java.com.springproject.first;

public class SpringHelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Message: " + message);
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
