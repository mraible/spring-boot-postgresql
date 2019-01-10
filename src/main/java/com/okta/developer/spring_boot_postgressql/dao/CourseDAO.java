package com.okta.developer.spring_boot_postgressql.dao;

import com.okta.developer.spring_boot_postgressql.entities.Course;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface CourseDAO extends CrudRepository<Course, UUID> {}
