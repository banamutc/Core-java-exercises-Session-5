package Homework;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

public class StudentUTC {
    private String name;
    private LocalDate dateOfBirth;
    private int age;
    private String classStudy;

    public StudentUTC() {

    }
    public StudentUTC(String name, LocalDate dateOfBirth, int age, String classStudy) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.classStudy = classStudy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassStudy() {
        return classStudy;
    }

    public void setClassStudy(String classStudy) {
        this.classStudy = classStudy;
    }
    public void inputStudentUTC() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name: ");
        name = sc.nextLine();
        do {
            System.out.println("Nhập ngày sinh : ");
            dateOfBirth = LocalDate.parse(sc.nextLine());
            age = LocalDate.now().getYear() - dateOfBirth.getYear();
        } while (age <= 0);
        System.out.print("enter age: ");
        age = sc.nextInt();
        System.out.println("enter class study: ");
        classStudy = sc.nextLine();
    }

    public String toString() {
        return "name: " + this.name + " , Date of brith: " + this.dateOfBirth
                + " , age: " + this.age + " , class study: " + this.classStudy;
    }
}
