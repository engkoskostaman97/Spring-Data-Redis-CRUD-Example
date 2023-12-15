package belajar.crud.redis.redis.java.spring.repository;
import org.springframework.data.repository.CrudRepository;

import belajar.crud.redis.redis.java.spring.model.Student;
public interface StudentRepository extends CrudRepository<Student, String> {
}