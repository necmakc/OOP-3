/**
 * TODO: Доработать в рамках домашнего задания
 */
public class Freelancer extends Employee {

    public Freelancer(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (плавующая) %.2f; Возраст %d",
                surName, name, salary,age);
    }
}