package Interface;

//100% abstraction

//Only method declaration is allowed inside an interface
//Class --> Class --> extends
//Class --> Interface --> implements
//Interface  --> Interface --> extends

interface A{
    void drive();
    void music();
    void reverse();
}

class B implements A{

    @Override
    public void drive() {

    }

    @Override
    public void music() {

    }

    @Override
    public void reverse() {

    }
}
public class InterfaceDemo {
}
