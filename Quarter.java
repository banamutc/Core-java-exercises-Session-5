package Homework;

import java.util.Scanner;

public class Quarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number household:");
        int numberHouse = sc.nextInt();
        for (int j = 0; j < numberHouse; j++) {
            System.out.println("ho gia dinh " + (j + 1) + " la :");
            System.out.println("enter number of days using electricity:");
            int dayUseEle = sc.nextInt();
            double totalEle = 0;
            System.out.println("enter number member: ");
            int numberMember = sc.nextInt();
            while (numberMember <= 0) {
                System.out.println("Error!!! ");
                System.out.println("re-enter number member");
                numberMember = sc.nextInt();
            }
            Person[] people;
            people = new Person[numberMember];
            for (int i = 0; i < numberMember; i++) {
                System.out.println("thanh vien thu " + (i + 1) + " la :");
                people[i] = new Person();
                people[i].inputPerson();
            }
            System.out.println("---------------------------------");
            System.out.println("Thong tin ho dan vua nhap:");
            for (Person element : people) {
                System.out.println(element.toString());
            }
            if ( dayUseEle <= 31 && dayUseEle > 0 ) {
                for (Person element : people) {
                    System.out.println(element);
                    totalEle = numberMember * 2000 * dayUseEle;
                }
            }
            else {
                System.out.println("MUST ENTER FROM 1 TO 31!" +
                        "nhap lai di:");
                System.out.println("Re-enter number of days using electricity:");
                dayUseEle = sc.nextInt();
            }
            System.out.println();
            System.out.println("tong tien dien cua gia dinh thu " + (j + 1) + " la :" + totalEle);
            Person persons = new Person();
            int totalChildren = 0;
            for (Person element : people) {
                if (element.getAge() < 18)
                    totalChildren ++;
            }
            System.out.println("Số tre con duoi 18 tuoi là " + totalChildren);
        }


    }
}
