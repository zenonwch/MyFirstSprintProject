package main.java.com.springproject.first;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringHelloWorldRunner {
    //----- Using ApplicationContext Container -----//
    // ClassPathXmlApplicationContext
    public static void main(final String[] args) {
        final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        final SpringHelloWorld helloWorld = (SpringHelloWorld) ctx.getBean("springHelloWorld");
        final SpringHelloWorld init = (SpringHelloWorld) ctx.getBean("withInit");
        helloWorld.getMessage();
        init.getMessage();
    }

    // FileSystemXmlApplicationContext
//    public static void main(final String[] args) {
//        final ApplicationContext ctx = new FileSystemXmlApplicationContext("src/resources/applicationContext.xml");
//        final SpringHelloWorld message = (SpringHelloWorld) ctx.getBean("springHelloWorld");
//        message.getMessage();
//    }

    //----- Using Spring BeanFactory Container -----//
//    public static void main(final String[] args) {
//        final XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        final SpringHelloWorld message = (SpringHelloWorld) factory.getBean("springHelloWorld");
//        message.getMessage();
//    }

}
