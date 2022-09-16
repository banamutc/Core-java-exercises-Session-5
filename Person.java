package Homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private int day;
    private int month;
    private int age;
    private String job;

    public Person () {

    }

    public Person(String name, int day, int month, int age, String job) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void inputPerson() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name: ");
        name = sc.nextLine();
        System.out.println("enter day of brith: ");
        day = sc.nextInt();
        System.out.print("enter month of brith: ");
        month = sc.nextInt();
        System.out.println("enter age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("enter job: ");
        job = sc.nextLine();
    }

    public void outputPerson() {
        System.out.println( "Name: " + this.name + ", Date of brith: " + this.day + ", Month of brith: " + this.month + ", Age: " + this.age + ", Job: " + this.job);
    }
}
