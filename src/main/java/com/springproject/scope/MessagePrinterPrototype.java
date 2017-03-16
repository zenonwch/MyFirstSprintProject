package main.java.com.springproject.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessagePrinterPrototype {
    public static void main(final String[] args) {
        final ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:scopeContext.xml");

        final Message msg1 = (Message) ctx.getBean("prototypeBean");
        msg1.setMessage("Message from the first object");
        msg1.printMessage();

        final Message msg2 = (Message) ctx.getBean("prototypeBean");
        msg2.setMessage("Message from the second object");
        msg2.printMessage();

        msg1.printMessage();
    }
}
