package netology.hw432studentList;

import java.util.Objects;

public class Student {

    private String name;
    private String group;
    final private String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
//        return Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(name, group, studentId);
        return Objects.hash(studentId);  // типо чтоб потом можно было поменять остальное ?
    }

    @Override
    public String toString() {
        return "   - " +
                name + ", " +
                group + ", " +
                studentId
                ;
    }
}