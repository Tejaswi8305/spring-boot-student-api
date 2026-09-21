package com.example.student_api.repository;

import com.example.student_api.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public Student save(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> findAll() {
        return students;
    }
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    public Student update(int id, Student updatedStudent) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(updatedStudent.getName());
                student.setEmail(updatedStudent.getEmail());
                student.setCourse(updatedStudent.getCourse());

                return student;
            }
        }
        return null;
    }
    public boolean deleteById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }
}