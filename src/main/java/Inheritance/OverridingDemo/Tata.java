package Inheritance.OverridingDemo;

public class Tata extends Car {

    void Design (){
        super.Design();
        super.EngineType();
        System.out.println("Tata logo");
    }
    void EngineType(){
        System.out.println("3 cylinder engines");
    }
}
