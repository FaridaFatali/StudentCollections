package org.example;

import java.util.Comparator;
import org.example.students.AbstractStudent;

public class StudentNameComparator implements Comparator<AbstractStudent> {
    @Override
    public int compare(AbstractStudent student1, AbstractStudent student2) {
        return student1.getNameSurname().compareTo(student2.getNameSurname());
    }
}
