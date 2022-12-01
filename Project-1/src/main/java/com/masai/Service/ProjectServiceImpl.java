package com.masai.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entity.Project;
import com.masai.Repository.ProjectDao;

import com.masai.exception.ProjectNotFound;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectDao projectDao ;

	@Override
	public Project addNewDetails(Project project) throws ProjectNotFound {
		
    Optional<Project> ope=projectDao.findById(project.getProjectId());
		
		if(!ope.isPresent()) {
			
			projectDao.save(project);
			
			
		}
		else {
			throw new ProjectNotFound("Allready data is present .");
		}
		
		return project;
	}

	@Override
	public List<List<String>> getDetailsByCategory(Project project, String category) throws ProjectNotFound {
		
		List<List<String>> ab=new ArrayList<>();
		
		
        Optional<Project> ope=projectDao.findById(project.getProjectId());
		
		if(ope.isPresent() && ope.get().getCategory().equals(category)) {
			
			List<String> ab1=new ArrayList<>();
			List<String> ab2=new ArrayList<>();
			ab1.add(ope.get().getTitle());
			ab2.add(ope.get().getDiscription());
			ab.add(ab1);
			ab.add(ab2);
		}
		else {
			throw new ProjectNotFound("the data is not present .");
		}
		return ab;
	}
	
	
	
	

}
