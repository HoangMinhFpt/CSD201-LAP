/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author hoang minh
 */
public class Input {
    private String id;
    private String name;
    private int age;
    private double math;
    private double english;
    private double informatic;
    private double avg;

    public Input(String id, String name, int age, double math, double enghlish, double informaic) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.math = math;
        this.english = english;
        this.informatic = informatic;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }

    public double getInformatic() {
        return informatic;
    }
    
    public double avg(){
        return (math+english+informatic)/3;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public void setInformatic(double informatic) {
        this.informatic = informatic;
    }

    public void Printf(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Math: "+ math);
        System.out.println("English: "+ english);
        System.out.println("Informatic: "+ informatic);
        System.out.println("Avg: "+ avg());
    }
    
    
    
}
