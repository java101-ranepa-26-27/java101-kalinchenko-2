package ru.ranepa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Student student = new Student(name);

        // читаем оценки, пока не введут 0
        for (int grade = scanner.nextInt(); grade != 0; grade = scanner.nextInt()) {
            student.addGrade(grade);
        }

        student.printReport();
    }
}