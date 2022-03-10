package com.mirzarad.pma.dao;
import org.springframework.data.repository.CrudRepository;
import com.mirzarad.pma.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long>{

}
