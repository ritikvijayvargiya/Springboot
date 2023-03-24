package com.student.student.dao;


import com.student.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.PagingAndSortingRepository;

@EnableJpaRepositories
public interface StudentDao extends JpaRepository<Student,Long>, PagingAndSortingRepository<Student,Long> {
}
