package Runner;

import Classes.Bicycle;
import Classes.Student;

public class Runner {
    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle();
        Student signedUpStudent = new Student("Layla","Johnson",
                17,4);

        System.out.println("Welcome to this software. \n");

        //bicycle
        System.out.println("The brand is: " + myBicycle.getBrand());
        myBicycle.setBrand("Specialized");
        System.out.println("The brand of my bicycle is: " + myBicycle.getBrand());

        System.out.println("Initial velocity: " + myBicycle.getVelocity());

        myBicycle.pedal(5);
        myBicycle.pedal(8);
        System.out.println("Current Velocity: " + myBicycle.getVelocity());

        myBicycle.setColor("Dark Blue");
        System.out.println("The color of my bicycle is: " + myBicycle.getColor());

        myBicycle.brake(15);
        System.out.println("The velocity of my bicycle is: " + myBicycle.getVelocity());

        System.out.println("------------------------------------------------------------");

        //Student
        System.out.println("My name is: " + signedUpStudent.getName() + " " + signedUpStudent.getLastName());
        System.out.println("I'm " + signedUpStudent.getAge() + " years old.");
        System.out.println("Average: " + signedUpStudent.getAverage()+ "\n");

        signedUpStudent.setName("Andres");
        signedUpStudent.setLastName("Olaya");
        signedUpStudent.setAge(16);
        signedUpStudent.setAverage(3.5f);

        System.out.println("My name is: " + signedUpStudent.getName() + " " + signedUpStudent.getLastName());
        System.out.println("I'm " + signedUpStudent.getAge() + " years old.");
        System.out.println("Average: " + signedUpStudent.getAverage());

    }
}
