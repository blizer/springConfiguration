package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobeans.AccountService;

public class Main {
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifeCircle/beans.xml");
        Foo foo = applicationContext.getBean("foo", Foo.class);

        applicationContext.close();
    }
}
