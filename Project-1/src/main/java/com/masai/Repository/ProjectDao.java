package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Project;

@Repository
public interface ProjectDao extends  JpaRepository<Project,Integer>{
	
	

}
