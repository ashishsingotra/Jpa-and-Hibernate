package com.Ash.SpringBootH2.jpaandHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Ash.SpringBootH2.jpaandHibernate.course.Course;
import com.Ash.SpringBootH2.jpaandHibernate.course.springJpaRepository.CourseSpringDataJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String ...args) throws Exception{
		
		repository.save(new Course(1 ,"Learn Java", "Ash"));
		repository.save(new Course(2 ,"Learn JavaScript", "Ash"));
		repository.save(new Course(3 ,"Learn React", "Ash"));
		repository.deleteById(2l);
		System.out.println(repository.findById(3l));
		System.out.println(repository.findById(1l));
	}
}
