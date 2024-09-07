package io.github.tinemyumi.tinemyumi_webapp.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.github.tinemyumi.tinemyumi_webapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}