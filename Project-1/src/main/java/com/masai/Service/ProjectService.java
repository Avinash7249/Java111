package com.masai.Service;

import java.util.List;

import com.masai.Entity.Project;
import com.masai.exception.ProjectNotFound;

public interface ProjectService {
	
	public Project addNewDetails(Project project)throws ProjectNotFound;
	
	public List<List<String>> getDetailsByCategory(Project project,String category)throws ProjectNotFound;

}
