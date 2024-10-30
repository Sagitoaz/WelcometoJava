package BTVNBuoi1;

import java.util.Scanner;

public class StudentManager {
    public static Student insertInforStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten HS: ");

        String name = scanner.nextLine();
        System.out.print("Nhap dia chi HS: ");

        String add = scanner.nextLine();
        System.out.print("Nhap tuoi HS: ");

        int age = scanner.nextInt();
        System.out.print("Nhap diem 3 mon cua HS: ");

        float math = scanner.nextFloat();
        float literature = scanner.nextFloat();
        float english = scanner.nextFloat();

        Student newStudent = new Student(name, add, age, math, literature,english);

        return newStudent;
    }

    public static void outputStudent(Student HS) {
        System.out.print(HS);
        //System.out.format("%.2f ", HS.getAverageScore());
        //System.out.println(HS.getEduPerformance());
    }
}
