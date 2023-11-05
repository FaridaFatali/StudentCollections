package org.example.students;

import java.time.LocalDate;

public class MasterStudent extends GraduateStudent implements Comparable<GraduateStudent> {
    public MasterStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String advisor, String thesis) {
        super(no, nameSurname, year, dateOfBirth, major, advisor, thesis);
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        System.out.println("Registered as a Master student.");
    }

    @Override
    public void writeThesis() {
        super.writeThesis();
    }

    @Override
    public void meetWithAdvisor() {
        super.meetWithAdvisor();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toStringRegister() {
        return super.toStringRegister();
    }

//    @Override
//    public int compareTo(MasterStudent o) {
//        return 0;
//    }

//    @Override
//    public int compareTo(AbstractStudent other) {
//        return Integer.compare(this.getNo(), other.getNo());
//    }
}