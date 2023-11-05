package org.example.students;

import java.time.LocalDate;

public class VocationalStudent extends AbstractStudent implements Comparable<AbstractStudent> {

    public VocationalStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major) {
        super(no, nameSurname, year, dateOfBirth, major);
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        System.out.println("Registered as a Vocational student.");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toStringRegister() {
        return super.toStringRegister();
    }

    @Override
    public int compareTo(AbstractStudent other) {
        return Integer.compare(this.getNo(), other.getNo());
    }
}