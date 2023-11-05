package org.example.students;

import java.time.LocalDate;

public abstract class AbstractStudent implements Student {
    protected int no;
    protected String nameSurname;
    protected int year;
    protected LocalDate dateOfBirth;
    protected String major;

    public AbstractStudent(int no, String nameSurname, int year, LocalDate dateOfBirth, String major) {
        this.no = no;
        this.nameSurname = nameSurname;
        this.year = year;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
    }

    public int getNo() {
        return no;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void study() {
        System.out.println("The student is studying.");
    }

    @Override
    public String toString() {
        return "STUDENT INFO" +
                "\n-----------" +
                "\nNo: " + no +
                "\nName and Surname: " + nameSurname +
                "\nDate Of Birth: " + dateOfBirth +
                "\nYear: " + year +
                "\nMajor: " + major;
    }

    public String toStringRegister() {
        return "STUDENT INFO" +
                "\n-----------" +
                "\nNo: " + no +
                "\nName and Surname: " + nameSurname +
                "\nDate Of Birth: " + dateOfBirth +
                "\nMajor: " + major +
                "\nYear: " + year;
    }

    public abstract int compareTo(AbstractStudent other);
}