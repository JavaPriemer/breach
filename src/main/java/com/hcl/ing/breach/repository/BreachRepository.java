
package com.hcl.ing.breach.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ing.breach.entity.Breach;

@Repository
public interface BreachRepository extends JpaRepository<Breach, Long> {
	
	List<Breach> findByBreachId(Long breachId);

}
