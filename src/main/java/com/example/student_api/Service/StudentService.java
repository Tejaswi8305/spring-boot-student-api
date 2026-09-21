package com.example.student_api.Service;

import org.springframework.stereotype.Service;
import com.example.student_api.model.Student;
import com.example.student_api.repository.StudentRepository;
import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student getStudentById(int id) {
        return studentRepository.findById(id);
    }
    public Student updateStudent(int id, Student student) {
        return studentRepository.update(id, student);
    }
    public boolean deleteStudent(int id) {
        return studentRepository.deleteById(id);
    }
}
