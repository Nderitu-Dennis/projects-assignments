package tech.csm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.csm.model.Project;
import tech.csm.model.ProjectAssignment;
import tech.csm.repository.ProjectRepository;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getBillableProjectsByTeam(Integer teamId) {
        return projectRepository.findByTeam_TeamIdAndStatusAndIsBillable(teamId, "Active", true);
    }

	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}
}
