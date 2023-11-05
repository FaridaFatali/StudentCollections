package org.example;

import java.util.Comparator;
import org.example.students.AbstractStudent;

public class StudentDateOfBirthComparator implements Comparator<AbstractStudent> {
    @Override
    public int compare(AbstractStudent student1, AbstractStudent student2) {
        return student1.getDateOfBirth().compareTo(student2.getDateOfBirth());
    }
}
