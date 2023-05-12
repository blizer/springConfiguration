package beanlifecycle;

public class Foo {
    public void init(){
        System.out.println("init method is called");
    }
    public void destroy()
    {
        System.out.println("destroy method is called");
    }
}
