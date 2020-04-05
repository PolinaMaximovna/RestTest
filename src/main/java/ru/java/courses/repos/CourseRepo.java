package ru.java.courses.repos;

import org.springframework.data.repository.CrudRepository;
import ru.java.courses.domain.Course;

public interface CourseRepo extends CrudRepository<Course, Long> {
}
