package ru.ranepa;
import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getAverage() {
        if (grades.isEmpty()) {
            return 0;}
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }return (double) sum / grades.size();
    }
    public void printReport() {
        System.out.println("Студент: " + name);
        System.out.println("Оценки: " + grades);
        System.out.println("Количество оценок: " + grades.size());
        System.out.printf("Средний балл: %.2f%n", getAverage());
    }
}