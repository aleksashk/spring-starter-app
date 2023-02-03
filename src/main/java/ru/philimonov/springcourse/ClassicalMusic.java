package ru.philimonov.springcourse;

public class ClassicalMusic implements Music{
    public String getSong() {
        return "Hungarian Rhapsody.";
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
}
