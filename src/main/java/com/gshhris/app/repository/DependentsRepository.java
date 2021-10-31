package com.gshhris.app.repository;

import com.gshhris.app.domain.Dependents;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Dependents entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DependentsRepository extends JpaRepository<Dependents, Long>, JpaSpecificationExecutor<Dependents> {}
