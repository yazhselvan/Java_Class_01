package Interface;

//100% abstraction

//Only method declaration is allowed inside an interface
//Class --> Class --> extends
//Class --> Interface --> implements
//Interface  --> Interface --> extends

interface A{

    int age = 10;
    String city = "Chennai";
    //Variable inside interface will be Final and static by default.
    void drive();
    void music();
    void reverse();
}

interface X{
    void run();
}

//Mutiple inheritance
//single child class having multiple parent classes
class B implements A,X{

    @Override
    public void drive() {
        System.out.println("Driving");
    }

    @Override
    public void music() {
        System.out.println("Playing music");
    }

    public void reverse(){
        System.out.println("Reversing");
    }

   public void run(){
       System.out.println("running");
   }


}
public class InterfaceDemo {
    public static void main(String[] args) {
        A obj = new B();
        //Creation of object with reference for interface A
        obj.drive();
        obj.music();
        obj.reverse();

        System.out.println(A.age);
        System.out.println(A.city);

        X obj1 = new B();
        obj1.run(); // --> This cannot be accessed without creating an object which as reference for
        //interface X


    }
}
