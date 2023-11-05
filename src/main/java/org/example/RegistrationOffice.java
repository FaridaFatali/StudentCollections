package org.example;

import java.time.*;
import java.util.*;
import org.example.students.*;

public class RegistrationOffice {
    LocalDate birthDate;
    public List<AbstractStudent> students = new ArrayList<>();

    public RegistrationOffice() {
    }

    public void getAStudent() {
        AbstractStudent student;
        int i = (int) (5 * Math.random());

        switch (i) {
            case 1 -> {
                birthDate = LocalDate.of(2000, Month.AUGUST, 28);
                student = new VocationalStudent(101, "Jonathan Stevens", 2022, birthDate, "Math");

                if (student instanceof VocationalStudent vocationalStudent) {
                    vocationalStudent.register();
                    vocationalStudent.study();
                    System.out.println();
                    System.out.println(vocationalStudent);
                }
            }
            case 2 -> {
                birthDate = LocalDate.of(1998, Month.MAY, 12);
                student = new UndergraduateStudent(108, "Jennifer Davis", 2020, birthDate, "IT", "Programming");

                if (student instanceof UndergraduateStudent undergraduateStudent) {
                    undergraduateStudent.register();
                    undergraduateStudent.study();
                    System.out.println();
                    System.out.println(undergraduateStudent);
                }
            }
            case 3 -> {
                birthDate = LocalDate.of(1997, Month.JANUARY, 22);
                student = new GraduateStudent(118, "Jon Robertson", 2008, birthDate, "Psychology", "Jonathan Malbro", '"' + "The psychology of nations" + '"');

                if (student instanceof GraduateStudent graduateStudent) {
                    graduateStudent.register();
                    graduateStudent.study();
                    graduateStudent.writeThesis();
                    graduateStudent.meetWithAdvisor();
                    System.out.println();
                    System.out.println(graduateStudent);
                }
            }
            case 4 -> {
                birthDate = LocalDate.of(1994, Month.FEBRUARY, 1);
                student = new MasterStudent(120, "Angelica Gonzales", 2015, birthDate, "Geography", "Regina Melton", '"' + "Rare natural phenomena" + '"');

                if (student instanceof MasterStudent masterStudent) {
                    masterStudent.register();
                    masterStudent.study();
                    masterStudent.writeThesis();
                    masterStudent.meetWithAdvisor();
                    System.out.println();
                    System.out.println(masterStudent);
                }
            }
            default -> {
                birthDate = LocalDate.of(1992, Month.APRIL, 4);
                student = new PhdStudent(132, "Malena Brown", 2012, birthDate, "Journalism", "Roberto Gray", '"' + "A history of American journalism" + '"', true);

                if (student instanceof PhdStudent phdStudent) {
                    phdStudent.register();
                    phdStudent.study();
                    phdStudent.writePaper();
                    phdStudent.writeThesis();
                    phdStudent.meetWithAdvisor();
                    System.out.println();
                    System.out.println(phdStudent);
                }
            }
        }

        students.add(student);
    }

    public void registerStudent() {
        int i = (int) (5 * Math.random());

        AbstractStudent student;
        switch (i) {
            case 1 -> {
                birthDate = LocalDate.of(2000, Month.AUGUST, 28);
                student = new VocationalStudent(101, "Jonathan Stevens", 2022, birthDate, "Math");

                if (student instanceof VocationalStudent vocationalStudent) {
                    System.out.println("The student has been registered successfully as a Vocational Student!");
                    System.out.println();
                    System.out.println(vocationalStudent.toStringRegister());
                }
            }
            case 2 -> {
                birthDate = LocalDate.of(1998, Month.MAY, 12);
                student = new UndergraduateStudent(108, "Jennifer Davis", 2020, birthDate, "IT", "Programming");

                if (student instanceof UndergraduateStudent undergraduateStudent) {
                    System.out.println("The student has been registered successfully as an Undergraduate Student!");
                    System.out.println();
                    System.out.println(undergraduateStudent.toStringRegister());
                }
            }
            case 3 -> {
                birthDate = LocalDate.of(1997, Month.JANUARY, 22);
                student = new GraduateStudent(118, "Jon Robertson", 2018, birthDate, "Psychology", "Jonathan Malbro", '"' + "The psychology of nations" + '"');

                if (student instanceof GraduateStudent graduateStudent) {
                    System.out.println("The student has been registered successfully as a Graduate Student!");
                    System.out.println();
                    System.out.println(graduateStudent.toStringRegister());
                }
            }
            case 4 -> {
                birthDate = LocalDate.of(1994, Month.FEBRUARY, 1);
                student = new MasterStudent(120, "Angelica Gonzales", 2015, birthDate, "Geography", "Regina Melton", '"' + "Rare natural phenomena." + '"');

                if (student instanceof MasterStudent masterStudent) {
                    System.out.println("The student has been registered successfully as a Master Student!");
                    System.out.println();
                    System.out.println(masterStudent.toStringRegister());
                }
            }
            default -> {
                birthDate = LocalDate.of(1992, Month.APRIL, 4);
                student = new PhdStudent(134, "Malena Brown", 2012, birthDate, "Journalism", "Roberto Gray", '"' + "A history of American journalism" + '"', true);

                if (student instanceof PhdStudent phdStudent) {
                    System.out.println("The student has been registered successfully as a Ph.D. Student!");
                    System.out.println();
                    System.out.println(phdStudent.toStringRegister());
                }
            }
        }

        students.add(student);
    }

    public void sortStudentByName() {
        students.sort(new StudentNameComparator());
    }

    public void sortStudentByDateOfBirth() {
        students.sort(new StudentDateOfBirthComparator());
    }

    public void sortStudentByNo() {
        students.sort(new StudentNoComparator());
    }
}