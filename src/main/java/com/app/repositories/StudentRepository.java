package com.app.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	@Query("SELECT name FROM Student s WHERE s.name LIKE %:studentName%")
	String findByName(String studentName);
}
