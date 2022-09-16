package Homework;

import java.util.Scanner;

public class Retry {
    public static void main(String[] args) {
        Library[] libraries;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so the muon :");
        int numberCard = scanner.nextInt();
        scanner.nextLine();
        libraries = new Library[numberCard];
        for (int i = 0; i < numberCard; i++) {
            libraries[i] = new Library();
            System.out.println("Nhap thong tin the thu " + (i + 1) + " :");
            libraries[i].inputLibrary();
        }
        System.out.println("--------------------------------------");
        System.out.println("thong tin vua nhap la :");
        for (Library element : libraries) {
            System.out.println(element.toString());
        }

        int count = 0;
        for (Library element : libraries) {
            if (element.getClassStudy().equals("CNTT2"))
                count ++;
        }
        System.out.println("Số thẻ mượn của lớp CNTT2 là " + count);
    }
}
