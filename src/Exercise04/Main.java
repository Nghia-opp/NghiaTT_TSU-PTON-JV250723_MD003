package Exercise04;

import java.util.Scanner;

public class Main {
    public static <students> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student("Bob",21,"A1",7);
        Student student2 = new Student("Andrew",20,"A2",8.5);
        Student student3 = new Student("John",19,"A3",6.9);
        Student student4 = new Student("Boppy",22,"A1",9.1);
        Student student5 = new Student("Snow",20,"A4",7.2);
        Student student6 = new Student("Bell",21,"A2",8.2);
        Student student7 = new Student("Jin",20,"A3",7.3);

        Student[] students = new Student[]{student1,student2,student3,student4,student5,student6,student7};

        System.out.println("Nhap diem min: ");
        int min = scanner.nextInt();
        System.out.println("Nhap diem max: ");
        int max = scanner.nextInt();

        System.out.println("Danh sach sinh vien co diem trung binh tu "+ min +" den " + max);
        for(Student student : students){
            if(student.getAvgScore()>=min && student.getAvgScore()<=max) {
                student.display();
            }
        }
    }
}
