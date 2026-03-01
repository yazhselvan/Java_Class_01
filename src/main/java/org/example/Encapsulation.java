package org.example;

class LoginDetails{
    private int age;
    private String name;  //instance variable

    //Encapsulation - To be explained about getters and setters as well
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { //arguements inside can be called as local variables
        this.name = name;
    }
}

public class Encapsulation {



    public static void main(String[] args) {
        LoginDetails details = new LoginDetails();
//        details.age = 10;
        details.setAge(10);
        System.out.println(details.getAge());
    }

}
