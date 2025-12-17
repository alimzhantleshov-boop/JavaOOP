package edu.java.development;

public class Passanger {
    private String name;
    private String passportNumber;
    private int age;
    public Passanger(String name, String passportNumber, int age){
        this.name = name;
        this.passportNumber = passportNumber;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String getPassportNumber(){
        return passportNumber;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPassportNumber(String passportNumber){
        this.passportNumber = passportNumber;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + " | Passport: " +  passportNumber + " | Age: " + age);

    }
}
