package org.example;

public class Main {
    public static void main(String[] args) {
        RegistrationOffice register = new RegistrationOffice();

        System.out.println("Unsorted Student List:");
        register.students.forEach(System.out::println);

        for (int i = 0; i < 5; i++) {
            register.getAStudent();
            register.registerStudent();
        }

        System.out.println("\n**************************************************************");

        System.out.println("\nSORTED STUDENT LIST BY NAME AND SURNAME:");
        register.sortStudentByName();
        register.students.forEach(System.out::println);

        System.out.println("\n**************************************************************");

        System.out.println("\nSORTED STUDENT LIST BY DATE OF BIRTH:");
        register.sortStudentByDateOfBirth();
        register.students.forEach(System.out::println);

        System.out.println("\n**************************************************************");

        System.out.println("\nSORTED STUDENT LIST BY NO:");
        register.sortStudentByNo();
        register.students.forEach(System.out::println);
    }
}