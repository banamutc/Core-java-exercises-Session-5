package Homework;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class PrintNextDate {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("input date: ");
        LocalDate date = LocalDate.parse(sc.nextLine());
        date = date.plusDays(1);
        System.out.println("LocalDate after "
                + " adding days: " + date);
    }
}