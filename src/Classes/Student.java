package Classes;

public class Student {
    //Define attributes
    private String name;
    private String lastName;
    private int age;
    private float average;

    //Constructors
    public Student(){
        this.name = "";
        this.lastName = "";
        this.age = 0;
        this.average = 0f;
    }

    public Student(String studentName, String studentLastName, int studentAge,
                   float studentAverage){
        this.name = studentName;
        this.lastName = studentLastName;
        this.age = studentAge;
        this.average = studentAverage;
    }

    //Define methods
    //getters
    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public float getAverage(){
        return average;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAverage(float average) {
        this.average = average;
    }
}
