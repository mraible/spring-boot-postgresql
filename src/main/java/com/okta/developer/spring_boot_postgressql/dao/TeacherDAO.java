package com.okta.developer.spring_boot_postgressql.dao;

import com.okta.developer.spring_boot_postgressql.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface TeacherDAO extends CrudRepository<Teacher, UUID> {}
