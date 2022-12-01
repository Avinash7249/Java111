package com.masai.Controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Project;
import com.masai.Service.ProjectService;
import com.masai.exception.ProjectNotFound;


@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping(value="project")
	public ResponseEntity<Project> saveDetails(@Valid @RequestBody Project pro) throws ProjectNotFound {
		
		Project p1=projectService.addNewDetails(pro);
		
		return new ResponseEntity<Project>(p1,HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value ="project")
	public ResponseEntity<Project> GetDetails(@Valid @RequestBody Project pro ,@RequestParam(required = false)String category) throws ProjectNotFound{
		
         List<List<String>> p1=projectService.getDetailsByCategory(pro,category);
		
		return new ResponseEntity<Project>((Project) p1,HttpStatus.ACCEPTED);
	}

}
