package org.example;

import org.example.entity.Course;
import org.example.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static final String SPRING_CONFIG = "SpringConfig.xml";
    public static final String GPA_BELOW_5 = "gpaBelow5";
    public static final String GPA_ABOVE_5 = "gpaAbove5";
    public static final String MIN_GPA = "minGpa";
    public static final String MAX_GPA = "maxGpa";
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext(SPRING_CONFIG);
        Course math = context.getBean(GPA_BELOW_5,
                Course.class);
        System.out.println(math);
        math.print();
        Course music = context.getBean(
                GPA_ABOVE_5,
                Course.class);
        System.out.println(music);
        music.print();
        Course history = context.getBean(MIN_GPA, Course.class);
        System.out.println(history);
        history.print();
        Course geology = context.getBean(MAX_GPA, Course.class);
        System.out.println(geology);
        geology.print();

    }
}
