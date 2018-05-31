package acu.project1.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import acu.project1.persistence.entities.Course;
import acu.project1.persistence.entities.Domain;

@Repository
public interface DomainRepository extends JpaRepository<Course, Long>{
	Domain findByName(String name);
}
