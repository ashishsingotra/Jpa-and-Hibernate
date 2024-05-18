package com.Ash.SpringBootH2.jpaandHibernate.course.springJpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ash.SpringBootH2.jpaandHibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

}
