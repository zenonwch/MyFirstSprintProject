package main.java.com.springproject.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessagePrinterSingleton {
    public static void main(final String[] args) {
        final ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:scopeContext.xml");

        final Message msg = (Message) ctx.getBean("singletonBean");
        msg.setMessage("Message from the first object");
        msg.printMessage();

        final Message msg2 = (Message) ctx.getBean("singletonBean");
        msg2.printMessage();
        msg2.setMessage("Message from the seccond object");

        msg.printMessage();
    }
}
