package Homework;

import java.time.LocalDate;

import static Homework.TripCar.scanner;

public class Library extends StudentUTC {
    private String id;

    private LocalDate dayBorrowed;

    private LocalDate termBorrowed;

    private String numberBookStore;

    public Library() {

    }
    public Library(String id, LocalDate dayBorrowed, LocalDate termBorrowed, String numberBookStore) {
        this.id = id;
        this.dayBorrowed = dayBorrowed;
        this.termBorrowed = termBorrowed;
        this.numberBookStore = numberBookStore;
    }

    public Library(String name, LocalDate dateOfBirth, int age, String classStudy, String id, LocalDate dayBorrowed, LocalDate termBorrowed, String numberBookStore) {
        super(name, dateOfBirth, age, classStudy);
        this.id = id;
        this.dayBorrowed = dayBorrowed;
        this.termBorrowed = termBorrowed;
        this.numberBookStore = numberBookStore;
    }

    public void inputLibrary() {
        super.inputStudentUTC();
        scanner.nextLine();
        System.out.println("Nhap id: ");
        id = scanner.nextLine();
        do {
            System.out.println("Nhập ngày mượn : ");
            dayBorrowed = LocalDate.parse(scanner.nextLine());
        } while (dayBorrowed.isBefore(this.getDateOfBirth()));

        do {
            System.out.println("Nhập hạn trả : ");
            termBorrowed = LocalDate.parse(scanner.nextLine());
        } while (termBorrowed.isBefore(dayBorrowed));
        System.out.println("Nhap number bookstore:");
        numberBookStore = scanner.nextLine();
    }
    @Override
    public String toString() {
        return ", Id: " +this.id + ", day borrowed: " + this.dayBorrowed
                + ", term borrowed: " + this.termBorrowed + ", number bookstore: " + this.numberBookStore + super.toString();
    }

}
