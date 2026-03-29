package Abstraction;

/*
Abstraction  - what level of abstraction can a abstract class do?
0 to 100%
100% abstraction --> this will be achieved by Interface
 */

/*
1. if a method is abstract, then the class should be changed as abstract
2. if a derived class does not contain all the implementation of abstract method,
then the derived class should be changed as abstract class
3. Abstract class can or cannot have a abstract method. it is not mandatory
to have abstract methods inside abstract class
4. Abstract class can also have concrete methods --> reason for 0 to 100% abstraction
 */

abstract class Car{
   abstract void Drive(); //abstract method
    public void Park(){ //concrete methods
        System.out.println("Parking");
    };
    public void Reverse(){
        System.out.println("Reversing");
    };

    abstract void MusicSystem();
}

abstract class Venue extends Car{
    public void Drive(){
        System.out.println("Drive Mode in ECO");
        System.out.println("Drive Mode in SPORT");
    }
}

class HighEndVenue extends Car{
    public void Drive(){
        System.out.println("Drive Mode in ECO");
        System.out.println("Drive Mode in SPORT");
    }
    public void MusicSystem(){
        System.out.println("Play Music");
    }
}
public class AbstractionDemo {

    public static void main(String[] args) {
        //Classname objectName = new ClassName();
        //Reference              //new object creation
//    Car car = new Car(); //we cannot create object for a abstract class
        Car car =                       new HighEndVenue();
        //abstract class reference       //object creation should be for child class
        car.Drive();
        car.Park();
        car.MusicSystem();
    }

}
