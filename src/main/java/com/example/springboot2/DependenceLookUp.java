package com.example.springboot2;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class DependenceLookUp {
    @Lookup
    public StudentsPrototype createStudent() {
        return null;
    }

    public String university(String name) {
        StudentsPrototype student = createStudent();
        student.setName(name);
        return "В университете учится студент по имени " + student.getName();
    }
}