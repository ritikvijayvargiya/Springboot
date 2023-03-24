package com.student.student.service;

import com.student.student.entity.Student;
import com.student.student.entity.StudentPage;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StudentService  {
    public List<Student> getAllStudent();
    public Student getStudentbyId(long id);
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(long id);

    List<Student> sortByName();

    List<Student> sortByAge();

    public Page<Student> getPagination(StudentPage studentPage,long pageNo);
}
