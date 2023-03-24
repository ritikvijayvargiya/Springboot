package com.student.student.service;

import com.student.student.dao.StudentDao;
import com.student.student.entity.Student;
import com.student.student.entity.StudentPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentServiceImpl implements  StudentService{
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudent() {
        return studentDao.findAll();
    }

    @Override
    public Student getStudentbyId(long id) {
        return studentDao.findById(id).get();
    }

    @Override
    public Student addStudent(Student student) {

        return studentDao.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public void deleteStudent(long id) {
        studentDao.deleteById(id);

    }

    @Override
    public List<Student> sortByName() {
        return studentDao.findAll(Sort.by("name").ascending());
    }

    @Override
    public List<Student> sortByAge() {
        return studentDao.findAll(Sort.by("age").ascending());
    }

    @Override
    public Page<Student> getPagination(StudentPage studentPage,long pageNo) {
        studentPage.setPageNo((int) pageNo);
        Pageable pageable= PageRequest.of(studentPage.getPageNo(),studentPage.getPageSize());
        return studentDao.findAll(pageable);
    }


}
