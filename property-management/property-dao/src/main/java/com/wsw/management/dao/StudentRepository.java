package com.wsw.management.dao;


import com.wsw.management.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {
    public List<Student> findAll();
}
