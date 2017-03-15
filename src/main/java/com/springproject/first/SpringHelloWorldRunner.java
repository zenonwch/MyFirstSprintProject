package main.java.com.springproject.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldRunner {
    public static void main(final String[] args) {
        final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        final SpringHelloWorld helloWorld = (SpringHelloWorld) ctx.getBean("springHelloWorld");
        helloWorld.getMessage();
    }
}
