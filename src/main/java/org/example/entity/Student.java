package org.example.entity;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
public class Student implements Comparable<Student>{

    @ToString.Include
    private String name;
    @ToString.Include
    private String surname;
    private Double gpa;
    private List<String> studiedSubjects;

    @Override
    public int compareTo(Student student) {
        return Double.compare(getGpa(), student.getGpa());
    }
}
