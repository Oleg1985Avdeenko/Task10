package org.example.entity;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class Course {
    @ToString.Include
    private String courseName;
    @ToString.Include
    private String courseGPA;
    private List<Student> students;

    public void print(){
        students.forEach(student -> System.out.println(student));
    }
}
