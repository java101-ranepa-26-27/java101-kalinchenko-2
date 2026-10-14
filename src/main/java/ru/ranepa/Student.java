package ru.ranepa;
import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double average() {
        if (grades.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }
        return (double) sum / grades.size();
    }

    public String status() {
        double avg = average();
        if (avg >= 4.5) {
            return "отличник";
        }
        if (avg >= 3.5) {
            return "хорошист";
        }
        if (avg >= 2.5) {
            return "троечник";
        }
        return "неуспевающий";
    }

    public String report() {
        double avg = Math.round(average() * 100) / 100.0; // округляем до сотых
        String result = "Студент: " + name + "\n";
        result = result + "Оценки: " + grades + "\n";
        result = result + "Количество оценок: " + grades.size() + "\n";
        result = result + "Средний балл: " + avg + "\n";
        result = result + "Статус: " + status();
        return result;
    }

    public void printReport() {
        System.out.println(report());
    }
}
