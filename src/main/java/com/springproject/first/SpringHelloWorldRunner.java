package main.java.com.springproject.first;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringHelloWorldRunner {
    //Using ApplicationContext Container
    public static void main(final String[] args) {
        final ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        final SpringHelloWorld helloWorld = (SpringHelloWorld) ctx.getBean("springHelloWorld");
        helloWorld.getMessage();
    }

    //Using Spring BeanFactory Container
//    public static void main(final String[] args) {
//        final XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        final SpringHelloWorld message = (SpringHelloWorld) factory.getBean("springHelloWorld");
//        message.getMessage();
//    }

}
