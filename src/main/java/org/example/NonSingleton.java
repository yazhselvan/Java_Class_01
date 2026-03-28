package org.example;

public class NonSingleton {

    private String StudentName;

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    private String StudentEmail;



}

class main {
    public static void main(String[] args) {
        NonSingleton obj1 = new NonSingleton();
        obj1.setStudentName("John");
//

        NonSingleton obj2 = new NonSingleton();
        obj2.setStudentName("Jeni");
        System.out.println(obj2.getStudentName() +" "+obj1.getStudentName());
//        System.out.println(obj1 == obj2);
    }
}