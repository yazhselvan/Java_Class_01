package org.example;

/*

1. Database connection
2. WebDriver inititation
3. Report initiation


Rules for Singleton design method.
1. Private constructor
2. Static instance variable
3. public method to access instance
 */
public class singleTon {

    private singleTon(){

    }

    private static singleTon instance;

    public static singleTon getInstance(){
        if(instance == null){
            instance = new singleTon();
        }
        return instance;
    }

}

class A{
    public static void main(String[] args) {
        singleTon obj1 = singleTon.getInstance();
        //classname.objectname

        singleTon obj2 = singleTon.getInstance(); // --> indicates to a same reference point
        System.out.println(obj1 == obj2); //return boolean
    }
}




