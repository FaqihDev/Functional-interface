import Student.Student;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Student> students = List.of(
                new Student(1L,"Faqih Abdul Rachman", Student.Gender.MALE),
                new Student(2L,"Eli Nurlaeli", Student.Gender.FEMALE),
                new Student(3L,"Femi", Student.Gender.FEMALE),
                new Student(4L,"Kaishi Anshori Yasir", Student.Gender.MALE));

        List<Student> femaleStudent = new ArrayList<>();

        for (Student student : students) {
            if (Student.Gender.FEMALE.equals(student.getGender())) {
                femaleStudent.add(student);
            }
        }

        System.out.println("Female student list");
        for (Student female : femaleStudent) {
            System.out.println(female);
        }

        //Use Declarative approach using Stream

        System.out.println("Male student list");
        students.stream()
                .filter(student -> Student.Gender.MALE.equals(student.getGender()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}