package io.github.tinemyumi.tinemyumi_webapp;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface EmpresaRepository extends JpaRepository<Empresa,Long> {

}