package com.student.student.controller;

import com.student.student.entity.Student;
import com.student.student.entity.StudentPage;
import com.student.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return this.studentService.getAllStudent();
    }

    @GetMapping("/students/name")
    public List<Student> sortByName(){
        return this.studentService.sortByName();
    }

    @GetMapping("/students/age")
    public List<Student> sortByAge(){
        return this.studentService.sortByAge();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable long id){
        return this.studentService.getStudentbyId(id);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        return this.studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable long id){
        try{
            this.studentService.deleteStudent(id);
            return new  ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Pagination
  @GetMapping("students/pagination/{id}")
    public ResponseEntity<Page<Student>> getPagination(StudentPage studentPage,@PathVariable long id){
        return new ResponseEntity<>(this.studentService.getPagination(studentPage, id),HttpStatus.OK);
  }




}
