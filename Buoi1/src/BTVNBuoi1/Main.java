package BTVNBuoi1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumberOfStudent = scanner.nextInt();
        Student[] StudentList = new Student[NumberOfStudent + 1];
        for (int i = 1; i <= NumberOfStudent; ++i) {
            System.out.println("Nhap HS thu " + i + ":");
            StudentList[i] = StudentManager.insertInforStudent();
        }
        while (true) {
            System.out.print("Nhap STT cua HS (nhap 0 de thoat): ");
            int studentIndex = scanner.nextInt();
            if (studentIndex > NumberOfStudent) {
                System.out.println("Khong hop le!!!");
                continue;
            }
            if (studentIndex == 0) break;
            StudentManager.outputStudent(StudentList[studentIndex]);
        }
        scanner.close();
    }
}