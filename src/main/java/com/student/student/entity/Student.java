package com.student.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
    private @Id long id;
    private String name;
    private String subject;
    private String relationshipstatus;
    private int age;
    private String address;


    public Student(){

    }
    public Student(long id, String name, String subject, String relationshipstatus, int age, String address) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.relationshipstatus = relationshipstatus;
        this.age = age;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRelationshipstatus() {
        return relationshipstatus;
    }

    public void setRelationshipstatus(String relationshipstatus) {
        this.relationshipstatus = relationshipstatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", relationshipstatus='" + relationshipstatus + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
