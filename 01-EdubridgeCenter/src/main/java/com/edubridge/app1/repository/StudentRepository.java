package com.edubridge.app1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.app1.model.Student;



public interface StudentRepository extends JpaRepository<Student, Integer> {
	public List<Student> findByBatch(int batchcode);
}
