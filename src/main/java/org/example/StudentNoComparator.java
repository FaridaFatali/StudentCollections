package org.example;

import java.util.Comparator;
import org.example.students.AbstractStudent;

public class StudentNoComparator implements Comparator<AbstractStudent> {
    public int compare(AbstractStudent student1, AbstractStudent student2) {
        int result = Integer.compare(student1.getNo(), student2.getNo());

        if (result == 0) {
            result = student1.getNameSurname().compareTo(student2.getNameSurname());
        }

        if (result == 0) {
            result = student1.getDateOfBirth().compareTo(student2.getDateOfBirth());
        }

        return result;
    }
}
