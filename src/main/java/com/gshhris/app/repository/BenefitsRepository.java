package com.gshhris.app.repository;

import com.gshhris.app.domain.Benefits;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Benefits entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BenefitsRepository extends JpaRepository<Benefits, Long>, JpaSpecificationExecutor<Benefits> {}
