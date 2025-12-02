package Exercise03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person myPerson1 = new Person();
        Person myPerson2 = new Person();

        System.out.println("Nhap ten nguoi thu nhat: ");
        myPerson1.setName(scanner.nextLine());
        System.out.println("Nhap tuoi nguoi thu nhat: ");
        myPerson1.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Nhap ten nguoi thu hai: ");
        myPerson2.setName(scanner.nextLine());
        System.out.println("Nhap tuoi nguoi thu hai: ");
        myPerson2.setAge(scanner.nextInt());

        if(myPerson1.getAge() < myPerson2.getAge()) {
            System.out.println(myPerson1.getName() + " be tuoi hon "+myPerson2.getName());
        } else if (myPerson1.getAge() > myPerson2.getAge()) {
            System.out.println(myPerson1.getName() + " lon tuoi hon "+myPerson2.getName());
        } else {
            System.out.println(myPerson1.getName() + " va "+myPerson2.getName() + " bang tuoi nhau");
        }
    }
}
