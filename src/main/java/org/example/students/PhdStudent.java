package org.example.students;

import java.time.LocalDate;

public class PhdStudent extends GraduateStudent implements Comparable<GraduateStudent> {
    private boolean qualifyingExamTaken;

    public PhdStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
        super(no, nameSurname, year, dateOfBirth, major, advisor, thesis);
        this.qualifyingExamTaken = qualifyingExamTaken;
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public void register() {
        System.out.println("Registered as a PhD. Student.");
    }

    @Override
    public void writeThesis() {
        super.writeThesis();
    }

    @Override
    public void meetWithAdvisor() {
        super.meetWithAdvisor();
    }

    public void writePaper() {
        System.out.println("The student is writing paper...");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nQualifying Exam Taken: " + qualifyingExamTaken;
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